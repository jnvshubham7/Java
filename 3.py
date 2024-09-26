import os

def java_to_md(java_file, md_file):
    """Convert a .java file to a .md file with proper code block formatting."""
    with open(java_file, 'r') as java:
        with open(md_file, 'w') as md:
            md.write("```java\n")  # Start Java code block
            for line in java:
                md.write(line)      # Write each line from .java file
            md.write("```\n")      # End code block

def convert_java_to_md_in_directory(root_dir):
    """Walk through every directory and subdirectory, converting .java files to .md files."""
    for dirpath, _, filenames in os.walk(root_dir):
        for filename in filenames:
            if filename.endswith(".java"):
                java_file_path = os.path.join(dirpath, filename)
                md_file_path = os.path.join(dirpath, filename.replace(".java", ".md"))
                java_to_md(java_file_path, md_file_path)
                
                os.remove(java_file_path)
                
                
                print(f"Converted {java_file_path} to {md_file_path}")

# Provide the root directory where the search begins
root_directory = 'D:\GitHub\Java\TCS'  # Replace with your target directory

# Walk through all subdirectories and convert .java files to .md files
convert_java_to_md_in_directory(root_directory)

print("Conversion of all .java files to .md is complete.")
