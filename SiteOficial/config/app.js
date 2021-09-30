// PARTE FEITA PARA DECLARAR ALGUMA CONST NOVA
const express = require("express");
const app = express();
const morgan = require("morgan");

// TODA ROTA NOVA DEVE SER INSERIDA AQUI
const rotaUsuario = require("../routes/usuario");
const rotaIndex = require("../routes/index");

// CRIA O AMBIENTE DE DESENVOLVIMENTO
app.use(logger('dev'));

app.use((req, res, next) => {
  res.header("Access-Control-Allow-Origin", "*");
  res.header(
    "Access-Control-Allow-Header",
    "Origin, X-Requested-With ,Content-Type, Accept, Authorization"
  );

  if (req.method == "OPTIONS") {
    res.header(
      "Access-Control-Allow-Methods",
      "PUST, POST, PATCH, DELETE, GET"
    );
    return res.status(200).send({});
  }

  next();
});

app.use(express.urlencoded({ extended: false }));
app.use(express.json());

app.use("/index", rotaIndex);
app.use("/usuario", rotaUsuario);

// QUANDO NÃO ENCONTRA ROTA DECLARADA
app.use((req, res, next) => {
  const erro = new Error("Rota não encontrado");
  erro.status = 404;
  next(erro);
  console.error(ErroL43);
});

app.use((error, req, res, next) => {
  res.status(error.status || 500);
  return res.send({
    erro: {
      Mensagem: error.message,
    },
  });
});

module.exports = app;