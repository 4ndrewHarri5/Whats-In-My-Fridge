import axios from 'axios'

const INGREDIENT = 'apple'
const LOCAL_API = 'http://localhost:8080'
const COOKBOOK_API = `${LOCAL_API}/cookbook/${INGREDIENT}`

class RecipeService {

    retrieveRecipies() {
        return axios.get(`https://localhost:8080/cookbook/apples`);
    }
}

export default new RecipeService()