This app is to demonstrate the Jakarta EE 10 Core Profile.

To add event
curl -X 'POST' \
  'http://localhost:9080/ee-core-profile/api/events' \
  -H 'accept: */*' \
  -H 'Content-Type: application/x-www-form-urlencoded' \
  -d 'id=222&name=emily&time=222&location=london'
  
To retrieve all event

curl -X 'GET' \
  'http://localhost:9080/ee-core-profile/api/events' \
  -H 'accept: application/json'

To retrieve an event
curl -X 'GET' \
  'http://localhost:9080/ee-core-profile/api/events/222' \
  -H 'accept: application/json'

To update an event
curl -X 'PUT' \
  'http://localhost:9080/ee-core-profile/api/events/222' \
  -H 'accept: */*' \
  -H 'Content-Type: application/x-www-form-urlencoded' \
  -d 'name=Tom&time=888&location=London'

To delete an event
curl -X 'DELETE' \
  'http://localhost:9080/ee-core-profile/api/events/222' \
  -H 'accept: */*'
