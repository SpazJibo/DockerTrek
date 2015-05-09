The core for this project will be a MongoDB server. This document covers how we setup and run the container.

# Starting the container.
docker run -d -v <<Absolute Path to your data directory>>:/data --name=core -p 27017:27017 mongo
