$(document).ready(function () {

    $("#btnbuscapessoa").click(function () {

        $("#txtNome").html("");
        $("#txtSexo").html("");
        $("#txtData").html("");

        var id = $("#txtidpessoa").val();
        var dados = {id: id};

        $.getJSON("http://localhost:8080/Projeto01JSON/ctrlPessoa", dados, function (dadosrecebidos) {

            console.log(dadosrecebidos);
            var nome = dadosrecebidos.nome;
            var sexo = dadosrecebidos.sexo.descricao;
            var data = dadosrecebidos.datanascimentostr;

            $("#txtNome").html(nome).css("background-color", "orange");
            $("#txtSexo").html(sexo).css("background-color", "orange");
            $("#txtData").html(data).css("background-color", "orange");
        });

    });


});