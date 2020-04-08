var log101LoginReqForm = {"id": "123", "password": "abcdef"};

$("#login").on("click", function () {
  $.ajax({
    type: "POST",
    contentType: "application/json",
    url: "http://localhost:8080/log101/rest/login",
    data: JSON.stringify(log101LoginReqForm),
    dataType: "json",
  });
});
