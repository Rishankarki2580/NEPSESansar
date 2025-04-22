<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  <title>Add Article</title>
  <style>
    * {
      box-sizing: border-box;
    }

    body {
      margin: 0;
      font-family: "Segoe UI", sans-serif;
      background: linear-gradient(135deg, #6e8efb, #a777e3);
      display: flex;
      justify-content: center;
      align-items: center;
      min-height: 100vh;
      padding: 20px;
    }

    .form-container {
      background: white;
      border-radius: 15px;
      padding: 30px;
      width: 100%;
      max-width: 600px;
      box-shadow: 0 8px 20px rgba(0, 0, 0, 0.2);
    }

    h2 {
      text-align: center;
      color: #555;
      margin-bottom: 20px;
    }

    label {
      display: block;
      margin-top: 15px;
      margin-bottom: 5px;
      font-weight: bold;
      color: #333;
    }

    input[type="text"],
    input[type="email"],
    input[type="url"],
    textarea,
    select {
      width: 100%;
      padding: 12px;
      border: 1px solid #ccc;
      border-radius: 8px;
      outline: none;
      resize: vertical;
      transition: border-color 0.3s;
    }

    input:focus,
    textarea:focus,
    select:focus {
      border-color: #6e8efb;
    }

    textarea {
      min-height: 120px;
    }

    .switch-container {
      margin-top: 15px;
      display: flex;
      align-items: center;
      gap: 10px;
    }

    .switch-label {
      font-weight: bold;
      color: #333;
    }

    .switch {
      position: relative;
      display: inline-block;
      width: 50px;
      height: 25px;
    }

    .switch input {
      opacity: 0;
      width: 0;
      height: 0;
    }

    .slider {
      position: absolute;
      cursor: pointer;
      top: 0;
      left: 0;
      right: 0;
      bottom: 0;
      background-color: #ccc;
      border-radius: 25px;
      transition: 0.4s;
    }

    .slider:before {
      position: absolute;
      content: "";
      height: 19px;
      width: 19px;
      left: 3px;
      bottom: 3px;
      background-color: white;
      border-radius: 50%;
      transition: 0.4s;
    }

    input:checked + .slider {
      background-color: #6e8efb;
    }

    input:checked + .slider:before {
      transform: translateX(24px);
    }

    button {
      margin-top: 25px;
      width: 100%;
      padding: 12px;
      background: #6e8efb;
      border: none;
      color: white;
      border-radius: 8px;
      font-size: 16px;
      cursor: pointer;
      transition: background 0.3s;
    }

    button:hover {
      background: #5c7cfa;
    }
  </style>
</head>
<body>
  <div class="form-container">
    <h2>Add New Article</h2>
    <form id="articleForm">
      <label for="title">Title</label>
      <input type="text" id="title" name="title" required maxlength="150" />

      <label for="slug">Slug</label>
      <input type="text" id="slug" name="slug" required placeholder="e.g., breaking-news-nepal-budget-2025" />

      <label for="author">Author</label>
      <input type="text" id="author" name="author" />

      <label for="category">Category</label>
      <input type="text" id="category" name="category" />

      <label for="imageUrl">Image URL</label>
      <input type="url" id="imageUrl" name="imageUrl" />

      <label for="content">Content</label>
      <textarea id="content" name="content" required></textarea>

      <div class="switch-container">
        <label class="switch-label" for="published">Published</label>
        <label class="switch">
          <input type="checkbox" id="published" name="published" />
          <span class="slider"></span>
        </label>
      </div>

      <button type="submit">Submit Article</button>
    </form>
  </div>

  <script>
    document.getElementById("articleForm").addEventListener("submit", function (e) {
      e.preventDefault();
      alert("Article submitted! (Implement backend call here)");
    });
  </script>
</body>
</html>
