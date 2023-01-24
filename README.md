# page-object-testing-java
Examples for page object testing in Java

### Docker compose configuration to deploy Selenium Grid and nodes
```yaml
ersion: "3"
services:
  chrome:
    image: selenium/node-chrome:4.1.4-20220427
    shm_size: 2gb
    depends_on:
      - selenium-hub
    environment:
      - SE_EVENT_BUS_HOST=selenium-hub
      - SE_EVENT_BUS_PUBLISH_PORT=4442
      - SE_EVENT_BUS_SUBSCRIBE_PORT=4443
      - SE_NODE_MAX_INSTANCES=5
      - SE_NODE_MAX_SESSIONS=5
      - SE_NODE_SESSION_TIMEOUT=180
  firefox:
    image: selenium/node-firefox:4.1.4-20220427
    shm_size: 2gb
    depends_on:
      - selenium-hub
    environment:
      - SE_EVENT_BUS_HOST=selenium-hub
      - SE_EVENT_BUS_PUBLISH_PORT=4442
      - SE_EVENT_BUS_SUBSCRIBE_PORT=4443
      - SE_NODE_MAX_INSTANCES=5
      - SE_NODE_MAX_SESSIONS=5
      - SE_NODE_SESSION_TIMEOUT=180

  selenium-hub:
    image: selenium/hub:4.1.4-20220427
    container_name: selenium-hub
    ports:
      - "4442:4442"
      - "4443:4443"
      - "4444:4444"
```

### Start up Selenium hub and nodes
```
docker-compose up -d
```

### Stop Selenium hub and nodes
```
docker-compose down
```

### Exercises

**Implement the following scenarios**
1. Register a new user 
2. Validate login with a new user
3. Validate user logout
4. Add product from the product detail page to shopping car
5. Complete the checkout process

