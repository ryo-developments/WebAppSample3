var jsonData = [
    {"id": "1", "gameName": "Bloodborne", "companyName": "フロムソフトウェア"},
    {"id": "2", "gameName": "Skyrim", "companyName": "ベセスダ"}
];

$(function () {
    $("#data-table").DataTable({
        data: jsonData,
        columns: [
            {data: 'id'},
            {data: 'gameName'},
            {data: 'companyName'}
        ]
    });
});