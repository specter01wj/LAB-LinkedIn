var app = app || {};

app.allFlowersView = Backbone.View.extend({

  tagName: 'section',

  render: function(){
    this.colleciton.each(this.addFlower, this);
    return this;
  },

  addFlower: function(flower){
    var flowerView = new app.singleFlowerView({ model: flower });
    this.$el.append( flowerView.render().el );
  }


});

