<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="jakarta.servlet.http.*, jakarta.servlet.*, java.io.*, java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Poster</title>
<script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="flex flex-col min-h-screen">
	<div class="flex-grow">  
	<nav class="bg-gray-800">
    <div class="mx-auto max-w-7xl px-4 sm:px-6 lg:px-8">
      <div class="flex h-16 items-center justify-between">
        <div class="flex items-center">
          <div class="flex-shrink-0">
            <img class="h-8 w-8" src="https://tailwindui.com/img/logos/mark.svg?color=indigo&shade=500" alt="Your Company">
          </div>
          <div class="hidden md:block">
            <div class="ml-10 flex items-baseline space-x-4">
              <!-- Current: "bg-gray-900 text-white", Default: "text-gray-300 hover:bg-gray-700 hover:text-white" -->
              <a href="index.jsp" class="bg-gray-900 text-white rounded-md px-3 py-2 text-sm font-medium" aria-current="page">Home</a>
                <%
                  HttpSession sess = request.getSession(false);
                  if (sess != null && "admin".equals(sess.getAttribute("role"))) {
                %>
                    <a href="adminDashboard.jsp" class="text-gray-300 hover:bg-gray-700 hover:text-white rounded-md px-3 py-2 text-sm font-medium">Dashboard</a>
                <%
                  } else if (sess != null && "user".equals(sess.getAttribute("role"))) {
                %>
                    <a href="simpleDashboard.jsp" class="text-gray-300 hover:bg-gray-700 hover:text-white rounded-md px-3 py-2 text-sm font-medium">Dashboard</a>
                <%
                  }
                %>
            </div>
          </div>
        </div>
        <div class="hidden md:block">
          	
          <%
            if (sess != null && sess.getAttribute("email") != null) {
          %>
              <a href="Logout" class="text-gray-300 hover:bg-gray-700 hover:text-white rounded-md px-3 py-2 text-sm font-medium">Logout</a>
          <%
            } else {
          %>
              <a href="login.jsp" class="text-gray-300 hover:bg-gray-700 hover:text-white rounded-md px-3 py-2 text-sm font-medium">Login</a>
              <a href="register.jsp" class="text-gray-300 hover:bg-gray-700 hover:text-white rounded-md px-3 py-2 text-sm font-medium">Register</a>
          <%
            }
          %>
      </div>
    </div>
     </nav>

 
        <header class="bg-white shadow">
            <div class="mx-auto max-w-7xl px-4 py-6 sm:px-6 lg:px-8">
                <h1 class="text-3xl font-bold tracking-tight text-gray-900">Welcome to Our POSTER web service</h1>
                <p class="mt-2 text-gray-600">Discover the amazing features we offer and explore our services.</p>
            </div>
        </header>

        <main>
            <div class="mx-auto max-w-7xl py-6 sm:px-6 lg:px-8">
                <!-- Features section -->
                <div class="py-12 bg-white">
                    <div class="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8">
                        <h2 class="text-3xl font-extrabold text-gray-900">Features</h2>
                        <div class="mt-10 space-y-12 lg:space-y-0 lg:grid lg:grid-cols-3 lg:gap-8">
                            <div class="flex">
                                <div class="flex-shrink-0">
                                    <img class="h-12 w-12" src="https://tailwindui.com/img/logos/workflow-mark-indigo-600.svg" alt="Feature 1">
                                </div>
                                <div class="ml-4">
                                    <h3 class="text-lg leading-6 font-medium text-gray-900">Feature 1</h3>
                                    <p class="mt-2 text-base text-gray-500">Session Management.</p>
                                </div>
                            </div>
                            <div class="flex">
                                <div class="flex-shrink-0">
                                    <img class="h-12 w-12" src="https://tailwindui.com/img/logos/workflow-mark-indigo-600.svg" alt="Feature 2">
                                </div>
                                <div class="ml-4">
                                    <h3 class="text-lg leading-6 font-medium text-gray-900">Feature 2</h3>
                                    <p class="mt-2 text-base text-gray-500">Post management</p>
                                </div>
                            </div>
                            <div class="flex">
                                <div class="flex-shrink-0">
                                    <img class="h-12 w-12" src="https://tailwindui.com/img/logos/workflow-mark-indigo-600.svg" alt="Feature 3">
                                </div>
                                <div class="ml-4">
                                    <h3 class="text-lg leading-6 font-medium text-gray-900">Feature 3</h3>
                                    <p class="mt-2 text-base text-gray-500">User management</p>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </main>
    </div>
    <footer class="bg-gray-800 mt-auto">
        <div class="mx-auto max-w-7xl px-4 sm:px-6 lg:px-8 py-6">
            <p class="text-center text-gray-400 text-sm">&copy; 2024 FEROZI.PVT. All rights reserved.</p>
        </div>
    </footer>
</div>
</body>
</html>
