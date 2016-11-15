// Namespace our flowerApp
var app = app || {};

app.Router = Backbone.Router.extend({

routes :{
	"": "noCopy",
	"heirloomRose" : "heirloomRoseMessage",
	"rainbowRose": "rainbowRoseMessage",
	"redRose" : "redRoseMessage"
},

	noCopy: function(){
		$('#copy').html('');
	},

	heirloomRoseMessage: function(){
		$('#copy').html('Heirloom Roses!');
	},

	rainbowRoseMessage: function(){
		$('#copy').html('Rainbow Roses!');
	},

	redRoseMessage: function(){
		$('#copy').html('Red Rose!');
	},

});