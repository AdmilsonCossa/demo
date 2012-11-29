//backbone
	
	// model
	var Note = Backbone.Model.extend({
		//默认值
		defaults: {

				id : 0,
				title : '请输入标题...',
				content : '请输入内容...'

		},
		//初始化
		initialize: function() {
			
		}
	
	
	});
	
	
	// collection
	var NoteList = Backbone.Collection.extend({
		model : Note
	});
	
	var Notes = new NoteList;
	
	// view
	var NoteView = Backbone.View.extend({
		
		//指定标签
		tagName:  "li",
		
		//指定模板
		//template: _.template($('#item-template').html()),
		
		//events: {
			
		//}，
		
		initialize: function() {
			
		}
	});
	
	// App View
	var AppView = Backbone.View.extend({
		//指定位置
		//el: $("#main")
	});
	
	 var App = new AppView;
