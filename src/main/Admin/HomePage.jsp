<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  <title>Login & Signup</title>
  <style>
    * {
      box-sizing: border-box;
    }

    body {
      margin: 0;
      padding: 0;
      font-family: "Segoe UI", sans-serif;
      background: linear-gradient(135deg, #6e8efb, #a777e3);
      display: flex;
      justify-content: center;
      align-items: center;
      height: 100vh;
    }

    .container {
      width: 350px;
      background: white;
      border-radius: 15px;
      box-shadow: 0 8px 20px rgba(0,0,0,0.2);
      padding: 30px;
      transition: 0.3s ease-in-out;
    }

    h2 {
      text-align: center;
      color: #555;
    }

    input {
      width: 100%;
      padding: 12px;
      margin: 10px 0;
      border: 1px solid #ccc;
      border-radius: 8px;
      outline: none;
      transition: border-color 0.3s;
    }

    input:focus {
      border-color: #6e8efb;
    }

    button {
      width: 100%;
      padding: 12px;
      background: #6e8efb;
      border: none;
      color: white;
      border-radius: 8px;
      cursor: pointer;
      font-size: 16px;
      transition: background 0.3s;
    }

    button:hover {
      background: #5c7cfa;
    }

    .toggle, .forgot {
      text-align: center;
      font-size: 14px;
      color: #555;
    }

    .forgot {
      margin-top: 8px;
      margin-bottom: 16px;
    }

    .toggle {
      margin-top: 20px;
    }

    .toggle a, .forgot a {
      color: #6e8efb;
      text-decoration: none;
      font-weight: bold;
      cursor: pointer;
    }

    .hidden {
      display: none;
    }

    .social-login {
      margin-top: 12px;
      text-align: center;
    }

    .social-login button {
      background-color: #db4437;
      margin-top: 6px;
    }
  </style>
</head>
<body>
  <div class="container">
    <!-- Login Form -->
    <form id="loginForm">
      <h2>Login</h2>
      <input type="email" placeholder="Email" required />
      <input type="password" placeholder="Password" required />
      <div class="forgot">
        <a onclick="alert('Redirecting to password reset page...')">Forgot Password?</a>
      </div>
      <button type="submit">Login</button>
      <div class="social-login">
        <button type="button" onclick="alert('Login with Google (Placeholder)')">Login with Google</button>
      </div>
      <div class="toggle">
        Don't have an account? <a onclick="toggleForm()">Sign up</a>
      </div>
    </form>

    <!-- Signup Form -->
    <form id="signupForm" class="hidden">
      <h2>Sign Up</h2>
      <input type="text" placeholder="Username" required />
      <input type="email" placeholder="Email" required />
      <input type="password" placeholder="Password" required />
      <button type="submit">Create Account</button>
      <div class="toggle">
        Already have an account? <a onclick="toggleForm()">Login</a>
      </div>
    </form>
  </div>

  <script>
    const loginForm = document.getElementById("loginForm");
    const signupForm = document.getElementById("signupForm");

    function toggleForm() {
      loginForm.classList.toggle("hidden");
      signupForm.classList.toggle("hidden");
    }

    loginForm.addEventListener("submit", function (e) {
      e.preventDefault();
      alert("Logged in!");
    });

    signupForm.addEventListener("submit", function (e) {
      e.preventDefault();
      alert("Account created!");
    });
  </script>
</body>
</html>
