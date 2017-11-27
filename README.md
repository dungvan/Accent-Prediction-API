# Accent-Prediction-API
  This sources reused from <a href="https://github.com/tienthanhdhcn/Vietnamese-Accent-Prediction">Vietnamese Accent Prediction</a> to build a jsp server response a vietnamese text.
### How to use?
  Make a request to server with method `POST` and body is a vietnamese string, server will get string and response after accent prediction success.
  For eg:
    - request `POST` with body `"chi con mot chiec la"`
    - the response is `"chỉ còn một chiếc lá"`
### How to settup server?
  - First you must have a server (here i am using ubuntu vps)
  - Follow this <a href="https://www.digitalocean.com/community/tutorials/how-to-install-apache-tomcat-8-on-ubuntu-16-04">link</a> to settup enviroment to run jsp source in apache tomcat.
  - If your server has RAM less than 2Gb, you should make <a href="https://www.digitalocean.com/community/tutorials/how-to-add-swap-space-on-ubuntu-16-04">swap area</a> on your server to make sure that server working
  - This the time to deploy the source to server:
    - clone this repository:
      ```bash
        $ git clone https://github.com/dungvan2512/Accent-Prediction-API
      ```
    - Build a *.war file from project to deploy (you can get a pr.war file in this project).
    - Go to `http://your_server_domain_or_IP:8080/manager/html`, in `WAR file directory` tab, tou upload this WAR file and hit the deploy button.
    - In the final step, you must to copy the `datasets` folder to your server with path is the path show in your server: go to `http://your_server_domain_or_IP:8080/name_war_file` you will see the path.
      
      
