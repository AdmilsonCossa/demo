define([], function() {

	var AppRouter = Backbone.Router.extend({
		routes : {
			":model" : "listModel",
			":model/new" : "newModel",
			":model/:id" : "viewModel",
			":model/:id/edit" : "editModel"
		},

		listModel : function(model, params) {
			alert(model + " - " + params);
		},
		newModel : function(model, params) {
			alert(model + " - " + params);
		},
		viewModel : function(model, id, params) {
			alert(model + "[" + id + "]" + " - " + params);
		},
		editModel : function(model, id, params) {
			alert(model + "[" + id + "]" + " - " + params);
		},
	});

	return AppRouter;
});