# Read me

## how to use jackson

```ObjectMapper objectMapper = new ObjectMapper();```

```List<Recipie> cookBook = Arrays.asList(objectMapper.readValue(json, Recipie[].class));```

wrap it into an array