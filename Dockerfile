FROM nginx:1.20-alpine

COPY index.html /usr/share/nginx/index.html .styles.css .script.js

EXPOSE 80