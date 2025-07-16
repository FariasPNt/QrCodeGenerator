# QrCodeGenerator

## Sobre o QrCodeGenerator
QrCodeGenerator é uma API simples e flexível para gerar QR Codes, podendo ser adaptada para diversas aplicações.

Tecnologias utilizadas:
- Java
- Spring Boot
- Docker
- AWS

## Pré requisitos

- Docker
- Bucket na AWS


## Instruções

1. Clone o repositório:
```
    git clone https://github.com/FariasPNt/QrCodeGenerator.git
```
2. Configure o bucket:
Crie um arquivo ```.env``` na raiz do projeto com as variáveis:
````
   AWS_ACCESS_KEY_ID=SEU_ACCESS_KEY
   AWS_SECRET_ACCESS_KEY=SEU_SECRET_KEY
   AWS_S3_BUCKET=SEU_BUCKET_NAME
````
A variável ```` AWS_REGION ```` já está definida no Dockerfile

3. Construa a imagem Docker:
```
   docker build -t "nome a escolher"
```
4. Execute a aplicação via Docker:
````
   docker run -p 8080:8080 "nome a escolher"
````

## EndPoint
POST /qrcode
Requisição:
json
````
{
"text": "https://exemplo.com"
}
````

Resposta:
json
````
{
"imageUrl": "https://SEU_BUCKET.s3.amazonaws.com/qrcodes/uuid.png"
}
````

## Observações
- O projeto ignora o ``` .env ``` via .gitignore para segurança das credenciais.
- As variáveis de ambiente são a forma recomendada de passar as configurações de bucket e AWS, evitando alterar o Dockerfile diretamente, deixei o region definido por não ser necessário a mudança, caso precise, será preciso alterar diretamente no Dockerfile.





