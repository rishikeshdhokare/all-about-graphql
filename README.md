# GraphQL with Kotlin and Springboot

## query
GET http://localhost:8080/graphql

```
query{
  getAllProducts {
    id
    name
    price
  }
}
```

## mutation
POST http://localhost:8080/graphql 

```
mutation{
  updateProductPrice(productId: "111", newPrice: 1.5) {
    id,
    name,
    price
  }
}
```
