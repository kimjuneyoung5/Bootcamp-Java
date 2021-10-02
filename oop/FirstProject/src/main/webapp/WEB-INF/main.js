$(document).ready(() => {
	$('#searchForm').on('submit', (e) => {
		let searchText = $('#searchText'.val());
		getMovies(searchText);
		e.preventDefault();
	});
});

function getMovies(searchText){
	axios.get('http://www.omdbapi.com?s='+searchText)
		.then((response)=>{
			console.log(response);
			let movies = response.data.Search;
			let output = '';
			$.each(movies, (index, movie) => {
				output+=`
				<div class ="col">
					<div class="well text-center">
						<img src="${movie.Poster}">
						<h5>${movie.Title}</h5>
				`;
			});
			
			$('#movies').jsp(output);
		})
		.catch((err) => {
			console.log(err);
		});
}