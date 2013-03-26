define([], function() {
	var AppRouter = Backbone.Router.extend({
		routes : {
			"home" : "home",
			"help" : "help",
			":model/new" : "newModel",
			":model/:id" : "viewModel",
			":model/:id/edit" : "editModel"
		},

		home : function() {
			alert("home");
		},
		
		help : function() {
			alert("help");
		}

	});

	return {
		router: AppRouter
	};
});