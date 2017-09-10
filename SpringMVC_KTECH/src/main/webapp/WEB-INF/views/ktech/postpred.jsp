<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title></title>
   	<meta charset="UTF-8">
   	<meta name="viewport" content="width-device-width",initial-scale="1">
   	<title>k-tech</title>
   	<link rel="stylesheet" href="../css/bootstrap.css">
   	<link rel="stylesheet" href="../css/ktech.css">
   	<link rel="stylesheet" href="../css/select.css">
   	<link rel="stylesheet" href="../css/piechart.css">
</head>

<body>
	<nav class="navbar navbar-default">
      <div class="container-fluid">
         <div class="navbar-header">
            <button type="button" class="navboar-toggle collapsed" data-toggle="collapse"
            data-target="libs-example-navbar-collapse-1" aria-expanded="false">
               <span class="sr-only"></span>
               <span class="icon-bar"></span>
               <span class="icon-bar"></span>
               <span class="icon-bar"></span>
               
            </button>
            <a class="navbar-brand" href="../../ktech">K-TECH</a> 
         </div>
         <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">
               <li class="active"><a href="../../ktech/analysis">분석 조회 <span class="sr-only"></span></a></li>   
               <li><a href="../../ktech/predict">예측 조회</a><li>
               <li class="dropdown">
                  <a href="#" class ="dropdown-toggle" data-toggle="dropdown" role="button"
                      aria-haspopup="true" aria-expanded="false">기본 정보<span class="caret"></span></a>
                  <ul class="dropdown-menu">
                    <li><a href="../date/classic">경기 결과 조회(클래식)</a></li>
               <li><a href="../date/challenge">경기 결과 조회(챌린지)</a></li>
                  </ul>
               </li>
               
              </ul>
              <form class="navbar-form navbar-left">
              <div class="form-group">
                 <input type="text" class="form-control" placeholder="내용을 입력하세요.">
                 </div>
                 <button type="submit" class ="btn btn-default">검색</button>
              </form>
            
            </div>
      </div>
   </nav>

<!--<center><h1><div class="alert alert-info" role="alert">변수 선택 후<strong> 분석 결과</strong> </div></h1></center>-->
<div class="hint preload">
  <i class="icon-info"></i>
  Pssst... you can edit the text! Just click it :)
</div>
<br><br><br>
<div class="tongtong">
  <p class="bouncer" contenteditable>변수 선택 후 분석 결과</p>
</div>
<br>

<br><br>
<div class="panel-body"></div>
<c:forEach var="pred" items="${predList}">
			<div class="container1">
      		<br>
			<ul class="graphs stats-container centered biggie">			
				<li class="animated" data-provide="circular" data-fill-color="#ff3c41" data-percent="true" 
					data-initial-value="${pred.homeWin}" data-max-value="100" data-label="${game.team} WIN" style="width: 300px; height: 300px;"></li>     
			    <li class="animated" data-provide="circular" data-fill-color="#35bb46" data-percent="true"
			    	data-initial-value="${pred.homeDraw}" data-max-value="100" data-label="DRAW" style="width: 300px; height: 300px;"></li>  
			    <li class="animated" data-provide="circular" data-fill-color="#4d51fd" data-percent="true" 
			    	data-initial-value="${pred.homeLose}" data-max-value="100" data-label="${game.againstTeam} WIN" style="width: 300px; height: 300px;"></li>                     
			</ul>
			</div>
</c:forEach>		
	<div class="container" id="box">
	<div class="row">
		<div class="col-xs-12">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<h3 class="panel-title">
						<span class="glyphicon glyphicon-tags"></span>
						&nbsp;&nbsp;선택한 변수		
						</h3>
					</div>
					<div class="panel-body">
<center><p class="variance" style="color:#020048"><%
String[] str = request.getParameterValues("preds");
if(str == null) {
	out.print("[없음]");
} else {
	for(int i=0; i<str.length; i++){
		if(i == 0 && i == str.length - 1) {
			out.print("[" + str[i] + "]");
		} else if(i == 0) {
			out.print("[" + str[i] + "]　[");
		} else if(i == str.length - 1) {
			out.print(str[i] + "]");
		} else {
			out.print(str[i]+"]　[");
		}
	}
}
%></p></center>
					</div>
						</div>
								<div class="media-body">
									<h4 class="media-heading"></h4></div>

						</div>
					</div>
				</div>
<br><br>
<center>
   	<a href = "../schedulelist"><button type="button" class="btn btn-warning" id="btn">다른 경기 예측하기</button></a>
   	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
   	<a href = "../getpred/${game.gameId}"><button type="button" class="btn btn-warning" id="btn">다른 변수 고르기</button></a>
</center>
   
      <br><br><br><br>
<footer style="background-color: #020048; color: #ffffff">
    <div class="container">
      <br>
         <div class="row">
         <div class="col-sm-2" style="text-align: center;"><h5>Copyright &copy; 2017</h5><h5>하성윤,황도연,이옥주<br>김은혜,조진송</h5></div>
         <div class="col-sm-4"><h4>K-TECH</h4><p> 빅데이터 분석 개발자 양성과정 -KOSA</p></div>
            
      
 <div class="col-sm-2"><h4 style="text-align: center; "><span class="glyphicon glyphicon-ok"></span>&nbsp; by 황하이조김</h4></div>
   </div>
    </div>
      </footer>
      
      
   <script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
   <script src="../js/bootstrap.js"></script>
   
   <script>
   (function(c, e, l, j) {
	    var d = function(a, b) {
	        arguments.length && this.init(a, b);
	    };
	    d.CANVAS_NAMES = [ "back", "fill", "front" ];
	    var i = d, f;
	    f = l.createElement("canvas");
	    f.getContext ? (f = f.getContext("2d"), f = (e.devicePixelRatio || 1) / (f.webkitBackingStorePixelRatio || f.mozBackingStorePixelRatio || f.msBackingStorePixelRatio || f.oBackingStorePixelRatio || f.backingStorePixelRatio || 1)) : f = 1;
	    i.PIXEL_RATIO = f;
	    i = [ "ms", "moz", "webkit", "o" ];
	    for (f = 0; f < i.length && !e.requestAnimationFrame; f++) e.requestAnimationFrame = e[i[f] + "RequestAnimationFrame"], e.cancelAnimationFrame = e[i[f] + "CancelAnimationFrame"] || e[i[f] + "CancelRequestAnimationFrame"];
	    e.requestAnimationFrame || (e.requestAnimationFrame = function(a) {
	        return e.setTimeout(function() {
	            a();
	        }, 16);
	    });
	    e.cancelAnimationFrame || (e.cancelAnimationFrame = function(a) {
	        clearTimeout(a);
	    });
	    var q = function(a) {
	        arguments.length && this.init(a);
	    };
	    q.prototype = {
	        attributes: {
	            onLoop: null,
	            afterStop: null,
	            afterStopRequest: null,
	            params: {},
	            owner: null
	        },
	        init: function(a) {
	            this.options = c.extend({}, this.attributes, a);
	            this.animationHandle = null;
	            this.loops = 0;
	            this.stopRequested = !1;
	        },
	        start: function() {
	            var a = this;
	            this.animationHandle = e.requestAnimationFrame(function() {
	                a.options.onLoop.apply(a.options.owner, [ a._getThreadInfo() ]) && a._loop();
	            });
	        },
	        _getThreadInfo: function() {
	            return {
	                loops: ++this.loops,
	                params: this.options.params,
	                stopRequested: this.stopped
	            };
	        },
	        _kill: function() {
	            this.animationHandle && e.cancelAnimationFrame(this.animationHandle);
	            c.isFunction(this.options.afterStop) && this.options.afterStop.call(this.options.owner);
	            c.isFunction(this.options.afterStopRequest) && this.options.afterStopRequest.call(this.options.owner);
	        },
	        _loop: function() {
	            var a = this;
	            this.animationHandle = e.requestAnimationFrame(function() {
	                a.options.onLoop.apply(a.options.owner, [ a._getThreadInfo() ]) ? a._loop() : a._kill();
	            });
	        },
	        stop: function(a) {
	            this.stopped = !0;
	            this.options.afterStopRequest = a;
	        }
	    };
	    d.prototype = {
	        defaults: {
	            initialValue: 0,
	            maxValue: 100,
	            label: "",

	            labelClassName: "text-label",
	            title: "",
	            
	            titleClassName: "text-title",
	            dates: "",
	            datesClassName: "text-dates",
	            
	            percent: !1,
	            decimals: 0,
	            digitClassName: "digit-label",
	            format: null,
	            duration: 4e3,
	            fillColor: "#eeeeee",
	            wrapperClassName: "circular-stat",
	            outerThickness: 8,
	            fillThickness: 30
	        },
	        init: function(a, b) {
	            this.element = c(a);
	            this.options = c.extend({}, this.defaults, b, this.element.data());
	            this.attributes = {};
	            this.labels = {};
	            this.canvases = {};
	            this.activeAnimationThread = null;
	            this._parseOptions();
	            if (this.canvases = this._build()) this._drawBackside(this.canvases.back), this._drawFrontside(this.canvases.front), this.labels = this._attachLabels(), this._updateVal(0), this.animate(this.options.initialValue, !1);
	            return this;
	        },
	        _parseOptions: function() {
	            var a = Math.max(this.element.width(), this.element.height()) / 2, b = this.options.outerThickness;
	            this.attributes = c.extend({}, this.attributes, {
	                currentValue: 0,
	                radius: {
	                    back: a,
	                    fill: a - b,
	                    front: a - b - this.options.fillThickness
	                }
	            });
	        },
	        _createCanvas: function(a, b) {
	            if (0 === a || 0 === b) return console.log("Invalid canvas dimensions"), !1;
	            var g = l.createElement("canvas");
	            g.width = a * d.PIXEL_RATIO;
	            g.height = b * d.PIXEL_RATIO;
	            1 < d.PIXEL_RATIO && (g.style.width = a + "px", g.style.height = b + "px");
	            if (!g.getContext) if ("undefined" !== typeof G_vmlCanvasManager) G_vmlCanvasManager.initElement(g); else return console.log("Your browser does not support HTML5 Canvas, or excanvas is missing on IE"), !1;
	            return g;
	        },
	        _attachLabels: function() {
	            var a = c("<span></span>").addClass(this.options.digitClassName), b = c("<span></span>").addClass(this.options.labelClassName).text(this.options.label),  z = c("<span></span>").addClass(this.options.titleClassName).text(this.options.title), y = c("<span></span>").addClass(this.options.datesClassName).text(this.options.dates);;
	            
	            this.element.append([ a, b, z, y ]);
	            return {
	                digit: a,
	                text: b,
	                text: z,
	                text: y
	            };
	        },
	        _build: function() {
	            for (var a = {}, b, g = 2 * this.attributes.radius.back, m = 0; m < d.CANVAS_NAMES.length; ++m) {
	                if (!(b = this._createCanvas(g, g))) return !1;
	                b.style.position = "absolute";
	                b.style.top = 0;
	                b.style.left = 0;
	                b.className = d.CANVAS_NAMES[m];
	                a[d.CANVAS_NAMES[m]] = b;
	            }
	            this.element.addClass(this.options.wrapperClassName).append(c.map(a, function(a) {
	                return a;
	            }));
	            return a;
	        },
	        _drawBackside: function(a) {
	            var b = this.attributes.radius.back, g = this.attributes.radius.fill, a = a.getContext("2d"), c = a.createLinearGradient(0, 0, 0, 2 * b);
	            c.addColorStop(0, "#d5d5d5");
	            c.addColorStop(1, "#ffffff");
	            1 < d.PIXEL_RATIO && a.scale(d.PIXEL_RATIO, d.PIXEL_RATIO);
	            this._drawCircle(a, b, b, b);
	            a.fillStyle = c;
	            a.fill();
	            this._drawCircle(a, b, b, g);
	            a.fillStyle = "#eeeeee";
	            a.fill();
	        },
	        _drawFrontside: function(a) {
	            var b = this.attributes.radius.back, c = this.attributes.radius.front, a = a.getContext("2d");
	            1 < d.PIXEL_RATIO && a.scale(d.PIXEL_RATIO, d.PIXEL_RATIO);
	            this._drawCircle(a, b, b, c);
	            a.shadowColor = "rgba(0, 0, 0, 0.3)";
	            a.shadowBlur = 3;
	            a.shadowOffsetY = 1;
	            a.fillStyle = "#ffffff";
	            a.fill();
	        },
	        _drawCircle: function(a, b, c, d) {
	            a.beginPath();
	            a.arc(b, c, d, 0, 2 * Math.PI, !1);
	            a.closePath();
	        },
	        _updateVal: function(a, b, d) {
	            c.isNumeric(a) && c.isNumeric(b) && c.isNumeric(d) ? (d = (d - b) * a, a = Math.max(0, Math.min(b + 100 * d / this.options.maxValue, 100)), b = Math.max(0, Math.min(b + d, this.options.maxValue))) : (a = Math.min(this.attributes.currentValue / this.options.maxValue, 100), b = Math.min(this.attributes.currentValue, this.options.maxValue));
	            this.labels.digit[0].innerHTML = (c.isFunction(this.options.format) ? this.options.format : function(a, b, c) {
	                return this.options.percent ? a.toFixed(this.options.decimals) + "%" : b.toFixed(this.options.decimals) + "/" + c.toFixed(this.options.decimals);
	            }).apply(this, [ a, b, this.options.maxValue ]);
	        },
	        _redraw: function() {
	            var a = this.canvases.fill, b = a.getContext("2d"), c = this.attributes.radius.back, f = this.attributes.radius.fill, e = 2 * (this.attributes.currentValue / this.options.maxValue) * Math.PI;
	            b.fillStyle = this.options.fillColor;
	            b.clearRect(0, 0, a.width, a.height);
	            0 !== e && (b.save(), 1 < d.PIXEL_RATIO && b.scale(d.PIXEL_RATIO, d.PIXEL_RATIO), b.translate(c, c), b.rotate(-Math.PI / 2), b.beginPath(), b.arc(0, 0, f, 0, e, !1), b.lineTo(0, 0), b.closePath(), b.fill(), b.restore());
	            this._updateVal();
	        },
	        animate: function(a, b) {
	            function f(b) {
	                1 === b.loops && (j = (new Date).getTime(), r = 2 * (a / this.options.maxValue) * Math.PI, p = 2 * (this.attributes.currentValue / this.options.maxValue) * Math.PI);
	                var c = Math.min(((new Date).getTime() - j) / this.options.duration, 1), e = p + (r - p) * c;
	                h.clearRect(0, 0, n.width, n.height);
	                0 !== e && (h.save(), 1 < d.PIXEL_RATIO && h.scale(d.PIXEL_RATIO, d.PIXEL_RATIO), h.translate(i, i), h.rotate(-Math.PI / 2), h.beginPath(), h.arc(0, 0, l, 0, e, !1), h.lineTo(0, 0), h.closePath(), h.fill(), h.restore());
	                k._updateVal(c, k.attributes.currentValue, a);
	                return b.stopRequested || 1 <= c ? (k.attributes.currentValue += (a - k.attributes.currentValue) * c, !1) : !0;
	            }
	            function e(a) {
	                c(this).queue("circular", function(a) {
	                    (this.activeAnimationThread = new q({
	                        onLoop: function() {
	                            return f.apply(this, arguments);
	                        },
	                        afterStop: function() {
	                            a();
	                            0 === c(this).queue("circular").length && (this.activeAnimationThread = null);
	                        },
	                        owner: this
	                    })).start();
	                });
	                a && c(this).dequeue("circular");
	            }
	            if (c.isNumeric(a) && !(0 > a || a > this.options.maxValue)) {
	                var k = this, n = this.canvases.fill, h = n.getContext("2d"), i = this.attributes.radius.back, l = this.attributes.radius.fill, j, r, p;
	                h.fillStyle = this.options.fillColor;
	                !b && this.activeAnimationThread ? (c(this).clearQueue("circular"), this.activeAnimationThread.stop(function() {
	                    e.apply(this, [ !0 ]);
	                })) : e.apply(this, [ !this.activeAnimationThread ]);
	            }
	        },
	        option: function(a, b) {
	            if (0 === arguments.length) return c.extend({}, this.options);
	            if ("string" === typeof a) {
	                if (b === j) return this.options[a];
	                switch (a) {
	                  case "label":
	                    this.options[a] = b;
	                    this.labels.text.html(b);
	                    break;
	                  case "maxValue":
	                    this.options.percent || (this.attributes.currentValue = Math.max(Math.min(this.attributes.currentValue, b), 0), this.options[a] = b, this._redraw());
	                    break;
	                  case "percent":
	                    b && (this.options.maxValue = 100, this.attributes.currentValue = Math.max(Math.min(this.attributes.currentValue, 100), 0));
	                  case "format":
	                  case "decimals":
	                  case "fillColor":
	                  case "duration":
	                    this.options[a] = b, this._redraw();
	                }
	            }
	            return this;
	        }
	    };
	    d.defaults = d.prototype.defaults;
	    c.fn.CircularStat = function(a) {
	        var b = "string" === typeof a, e = Array.prototype.slice.call(arguments, 1), f = this;
	        if (b && "_" === a.charAt(0)) return f;
	        b ? this.each(function() {
	            var b = c.data(this, "circular-stat"), d = b && c.isFunction(b[a]) ? b[a].apply(b, e) : b;
	            if (d !== b && d !== j) return f = d, !1;
	        }) : this.each(function() {
	            c.data(this, "circular-stat") || c.data(this, "circular-stat", new d(this, a));
	        });
	        return f;
	    };
	    c(function() {
	        c('[data-provide="circular"]').each(function() {
	            var a = c(this);
	            a.CircularStat(a.data());
	        });
	    });
	})(jQuery, window, document);
   </script>
   
<script>
//Set bounce animation speed
var bounceSpeed = 7;

/* Ball Bouncing On Text © Yogev Ahuvia
 * ===========================================
 * This bouncing ball jumps over the words
 * inside the contentEditable paragraph.
 * The text itself is editable, the jump speed
 * is dynamic, and the ball bounce animation 
 * duration is set by the length of each word.
 *
 * Have you tried switching off the light? :)
 * -------------------------------------------
 * Works best on Google Chrome.
 */

var Bouncer = function(elem) {
  // init bouncable element and helpers
  this.$elem = $(elem);
  this.$ball = $('<div class="ball"></div>');
  this.$space = $('<span>&nbsp;</span>');
  this.timers = [];
  
  // handle in-place editing events
  this.$elem.on('blur', (function(instance) {
    return function() {
      instance.init();
      instance.bounce();
    };
  })(this));
  
  this.$elem.on('keypress', function(e) {
    var code = (e.keyCode ? e.keyCode : e.which);
    if (code == 13) {
      $(this).blur();
    }
  });
  
  // make it bounce
  this.init();
  this.bounce();
};

Bouncer.prototype.init = function() {
  // get element text for parsing
  this.elemText = this.$elem.text();
  
  // clone element for new text injection
  this.$cloned = this.$elem.clone()
                           .empty()
                           .addClass('cloned')
                           .removeAttr('contenteditable')
                           .appendTo(this.$elem.parent());
  
  // handle cloned element termination
  this.$cloned.on('click', (function(instance) {
    return function() {
      instance.reset();
      instance.$elem.focus();
      document.execCommand('selectAll', false, null);
    };
  })(this));
  
  this.$elem.hide(); // hide original element while animating
  this.$ball.appendTo(this.$cloned); // add ball to new element
  this.contentArray = this.elemText.split(' ');
};

Bouncer.prototype.bounce = function() {
  // ball animation incrementing delay
  var incrementingDelay = 0;
  
  // run through the text
  for (var j = 0; j < this.contentArray.length; j++) {
    var word = this.contentArray[j];
    
    // handle multiple spaces
    if (/\s/g.test(word)) {
      this.$space.clone().appendTo(this.$cloned);
      this.contentArray.splice(j, 1);
      j--;
      continue;
    }
    
    // escape each word with a span, add it to cloned element
    var $word = $('<span class="word">' + word + '</span>');
    this.$cloned.append($word);
    var wordLength = $word.width();
    
    // add white space elements between words
    if (j+1 < this.contentArray.length) {
      this.$space.clone().appendTo(this.$cloned);
    }
    
    // get ball position above word
    var ballLeft = $word[0].offsetLeft + wordLength/2;
    var ballTop = $word[0].offsetTop;
    
    var ballProps = {left: ballLeft,
                     top: ballTop,
                     wordLength: wordLength,
                     wordIndex: j};
    
    // preset timers for the whole text
    var timer = setTimeout((function(instance, ballProps) {
      return function() {
        instance.animateBall(ballProps);
      };
    })(this, ballProps), incrementingDelay);
    this.timers.push(timer);
    
    incrementingDelay += wordLength * bounceSpeed;
  }
  
  // hide ball when finished bouncing
  var timer = setTimeout((function(instance) {
    return function() {
      instance.$ball.fadeOut();
    };
  })(this), incrementingDelay);
  this.timers.push(timer);
}

Bouncer.prototype.animateBall = function(ballProps) {
  
  // set ball transition duration per word length
  var leftDuration = ballProps.wordLength * bounceSpeed + 'ms';
  var topDuration = (ballProps.wordLength * bounceSpeed / 2) + 'ms';
  this.$ball.css('transition-duration', 
                 leftDuration + ', ' + topDuration);
  
  // animate ball halfway and up
  var ballOffsetLeft = this.$ball[0].offsetLeft;
  var delta = ballProps.left - ballOffsetLeft;
  var ballHalfWay = ballOffsetLeft + delta;
  this.$ball.css({'left': ballHalfWay + 'px', 
                  'top': '-50px'});
  
  // finish animation when the ball reach halfway
  var halfwayReached = ballProps.wordLength * bounceSpeed / 2;
  var timer = setTimeout((function(instance, ballProps) {
    return function() {
      
      // animate ball to finish the bounce
      instance.$ball.css({'left': ballProps.left + 'px' , 
                          'top': '0px'});
      
      // light the bounced word when the ball bounces on it
      var bouncedOnWord = ballProps.wordLength * bounceSpeed / 2;
      var timer = setTimeout((function(instance, ballProps) {
        return function() {
          instance.$cloned
                  .find('.word')
                  .eq(ballProps.wordIndex)
                  .addClass('lit');
        };
      })(instance, ballProps), bouncedOnWord);
      instance.timers.push(timer);
    };
  })(this, ballProps), halfwayReached);
  this.timers.push(timer);
}

Bouncer.prototype.reset = function() {
  for (var i = 0; i < this.timers.length; i++) {
    clearTimeout(this.timers[i]);
  }
  this.timers.length = 0;
  
  this.$elem.show();
  this.$cloned.remove();
  this.$ball.removeAttr('style');
}

var bouncers = [];
$(document).ready(function() {
  // make all 'bouncer' classes, bounce
  $('.bouncer').each(function(index, element) {
    bouncers.push(new Bouncer(element));
  });;
  
  // show hint
  $('.hint').removeClass('preload');
  setTimeout(function() {
    $('.hint').addClass('open');
    setTimeout(function() {
      $('.hint').removeClass('open');
    }, 4000);
  }, 6000);
});   
</script>
   
</body>
</html>