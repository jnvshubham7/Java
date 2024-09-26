import os
from groq import Groq

# Initialize the Groq client with the API key directly
client = Groq(
    api_key="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",
)

# Define the input and output directories
input_directory = r"D:\GitHub\Java\TCS IPA"
output_directory = r"D:\GitHub\Java\TCS IPA"

# Ensure the output directory exists
os.makedirs(output_directory, exist_ok=True)

# Define the prompt for creating the articles
prompt = """
Please add the Java code below each question along with explanations. Ensure you include the input, output, and possible solutions.
Also, present the response in a structured markdown format with headers for questions and methods.
"""


# Function to load previous questions
def load_previous_questions(file_path):
    """Load previous questions and answers from the output file if it exists."""
    if os.path.exists(file_path):
        with open(file_path, 'r') as file:
            return file.read()
    return ""


# Function to save questions and answers to a file
def save_questions_and_answers(file_path, content):
    """Save the combined questions and answers to the output file."""
    with open(file_path, 'w') as file:
        file.write(content)


# Function to walk through directories and process Markdown files
def process_files_in_directory(input_dir, output_dir, prompt):
    """Process all markdown files in the input directory and generate responses based on the prompt."""
    for root, dirs, files in os.walk(input_dir):  # Walk through each directory and subdirectory
        # Create corresponding output subdirectories
        rel_path = os.path.relpath(root, input_dir)
        target_dir = os.path.join(output_dir, rel_path)
        os.makedirs(target_dir, exist_ok=True)

        for file in files:
            if file.endswith(".md"):
                input_file_path = os.path.join(root, file)
                output_file_path = os.path.join(target_dir, file)

                try:
                    # Read the content of the Markdown file (questions)
                    with open(input_file_path, 'r') as input_file:
                        current_content = input_file.read()

                    # Load previous questions if they exist
                    previous_questions = load_previous_questions(output_file_path)

                    # Combine the prompt, previous questions, and current content
                    combined_prompt = f"{prompt}\n\nPrevious Questions:\n{previous_questions}\n\nNew Question:\n{current_content}"

                    messages = [
                        {
                            "role": "user",
                            "content": combined_prompt,
                        }
                    ]

                    # Perform the chat completion using the Groq API
                    chat_completion = client.chat.completions.create(
                        messages=messages,
                        model="llama3-8b-8192",
                    )

                    # Get the response content (new question and answer)
                    response_content = chat_completion.choices[0].message.content

                    # Combine previous questions with the new answer
                    final_content = f"{previous_questions}\n\n{response_content}"

                    # Write the combined content to the output file
                    save_questions_and_answers(output_file_path, final_content)

                    print(f"Processed and saved: {output_file_path}")

                except Exception as e:
                    print(f"Error processing {input_file_path}: {e}")

# Start processing files
process_files_in_directory(input_directory, output_directory, prompt)
