var keyData=["id", "gameName", "companyName"];

var jsonData = [
    {[keyData[0]]: "1", [keyData[1]]: "Bloodborne", [keyData[2]]: "フロムソフトウェア"},
    {[keyData[0]]: "2", [keyData[1]]: "Skyrim", [keyData[2]]: "ベセスダ"},
    {[keyData[0]]: "3", [keyData[1]]: "RDR2", [keyData[2]]: "ロックスターゲームズ"}
];

$(function () {
    $("#data-table").DataTable({
        data: jsonData,
        columns: [
            {data: keyData[0]},
            {data: keyData[1]},
            {data: keyData[2]}
        ]
    });
});