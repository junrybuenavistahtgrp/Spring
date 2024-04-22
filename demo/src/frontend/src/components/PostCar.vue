<template>
	<div class="container">
		
		<form @submit.prevent="createPost">
			<div>
				<label for="model">Car Model</label>
				<input type = 'text' id="model" v-model="formData.model">
			</div>
			<div>
				<label for="color">Car Color</label>
				<input type = 'text' id="color" v-model="formData.color">
			</div>
			<button>Save</button>
		</form>
	</div>
</template>

<script>
import axios from "axios";

	export default{
		name:'CreatePost',
		data(){
			return{
				formData: {
					model: '',
					color: '',
				},
			}
			
		},
		methods:{
			createPost(){
				axios.post('http://localhost:8080/api',this.formData)
					.then((res) => console.log(res))
					.catch(error => console.log(error))
			}
		},
			
	}
</script>