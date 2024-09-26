import os
import shutil

# Base directory where we need to search
base_dir = r"D:\GitHub\Java\TCS IPA"
# Destination directory where files will be copied
dest_dir = os.path.join(base_dir, 'TCS')

# Create destination folder if not exists
if not os.path.exists(dest_dir):
    os.makedirs(dest_dir)

# Function to get a new name if file already exists
def get_new_name(filepath, dest_dir):
    base, ext = os.path.splitext(os.path.basename(filepath))
    counter = 1
    new_name = f"{base}{ext}"
    
    while os.path.exists(os.path.join(dest_dir, new_name)):
        new_name = f"{base}{counter}{ext}"
        counter += 1
    
    return os.path.join(dest_dir, new_name)

# Walk through directories
for root, dirs, files in os.walk(base_dir):
    for file in files:
        if file.endswith('.md'):
            # Full path to the file
            file_path = os.path.join(root, file)
            
            # Determine new path in the destination folder
            new_file_path = get_new_name(file_path, dest_dir)
            
            # Copy the file instead of moving
            shutil.copy2(file_path, new_file_path)
            print(f"Copied: {file_path} -> {new_file_path}")

print("All markdown files have been copied.")
