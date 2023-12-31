import axios from "axios";

const URL = "https://swapi.dev/api/people?format=json";

class CharacterClient{
    async findAll(){
        let response = []
        try{
            await axios.get(URL)
            .then((res) => {
                response = res.data;
            })
            .catch((err) => {
                console.log(err.message);
            });
        }catch(error){
            console.log(error.message);
        }
        return response;
    }
    async findByName(name){
        let response = []
        try{
            await
            axios.get(`${URL}&search=${name}`)
            .then((res) => {
                response = res.data;
            })
            .catch((err) => {
                console.log(err.message);
            });
        }catch(error){
            console.log(error.message);
        }
        return response;
    }
}

export default new CharacterClient();