# Baymax-middle
-
Google OAuth test steps (get user basic information):
1. Have the Spring Boot Application running your local environment.
1. Request the following link: https://accounts.google.com/o/oauth2/v2/auth?client_id=733427710928-nrs427urh5b6n47js1j5vlp50ctgfbnm.apps.googleusercontent.com&response_type=code&scope=https://www.googleapis.com/auth/userinfo.profile&redirect_uri=http://localhost:8080/oauth/grant&access_type=offline
2. Sign in with your gmail account.
3. Wait for the response to gather your basic personal info.
