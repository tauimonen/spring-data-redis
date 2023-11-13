# Spring Data Redis Demo Project

- Java 17
- Maven
- Spring Boot Starter Web
- Redis
- Jedis
- Lombok

### Product API

Welcome to the Product API! This API allows you to perform CRUD (Create, Read, Update, Delete) operations on product entities.


#### Endpoints

1. **Home**
   - **URL:** `/`
   - **Method:** GET
   - **Description:** Retrieve a welcome message for the Product API.

2. **Save Product**
   - **URL:** `/products/save`
   - **Method:** POST
   - **Request Body:** Product object in JSON format
   - **Description:** Save a new product.

3. **Get All Products**
   - **URL:** `/products/getAll`
   - **Method:** GET
   - **Description:** Retrieve a list of all products.

4. **Get Product by ID**
   - **URL:** `/products/getById/{productId}`
   - **Method:** GET
   - **Path Variable:** `productId` - ID of the product to retrieve
   - **Description:** Retrieve product details by ID.

5. **Remove Product**
   - **URL:** `/products/remove/{productId}`
   - **Method:** DELETE
   - **Path Variable:** `productId` - ID of the product to remove
   - **Description:** Remove a product by ID.

#### Response Formats

- **Save Product, Get Product by ID:**
  - **Success Response:** Product object in JSON format
  - **Error Response:** Error message in case of failure

- **Get All Products:**
  - **Success Response:** List of Product objects in JSON format
  - **Error Response:** Error message in case of failure

- **Remove Product:**
  - **Success Response:** None
  - **Error Response:** Error message in case of failure

#### Error Handling

- All error responses include an error message that provides information about the issue.

#### Example Usage

1. **Save Product**
   ```bash
   POST /products/save
   Request Body:
   {
     "id": 1,
     "name": "Product Name",
     "price": 19.99,
     "quantity": 50
   }
   ```

2. **Get All Products**
   ```bash
   GET /products/getAll
   ```

3. **Get Product by ID**
   ```bash
   GET /products/getById/1
   ```

4. **Remove Product**
   ```bash
   DELETE /products/remove/1
   ```

Feel free to customize the base URL and add any additional details or constraints specific to your application requirements.
