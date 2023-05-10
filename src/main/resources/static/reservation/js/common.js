

/* input-text 엔터키 submit 방지 */
$('input[type="text"]').keydown(function() {
	if (event.keyCode === 13) {
		event.preventDefault();
	};
});

/* court */
function selectCourt(e) {
	const text = e.options[e.selectedIndex].text;

	document.getElementById('court').innerText = text;
}

/* placeForm */
function getPlaceForm(event) {
	document.getElementById('placeForm').innerText = event.target.value;
}

/* startTime */
function getStartTime(e) {
	const text = e.options[e.selectedIndex].text;

	document.getElementById('startTime').innerText = text;
}

/* endTime */
function getEndTime(e) {
	const text = e.options[e.selectedIndex].text;

	document.getElementById('endTime').innerText = text;
}

/* status */
function getStatus(event) {
	document.getElementById('status').innerText = event.target.value;
}

/* input text */
/* price*/
function getPrice()  {
	const text = document.getElementById('inputPrice').value;
	
	document.getElementById('price').innerText = text;
}

/* calendar */
function getDate()  {
	const text = document.getElementById('setDate').value;
	
	document.getElementById('date').innerText = text;
}

/* check */
/*$(document).ready(function() {
	$("#insert").on("click", function(e) {
		e.preventDefault();
		fn_insertReservation();
	});
	
	$("#cancle").on("click", function(e) {
		e.preventDefault();
		fn_openReservation();
	});
});*/

/* insert check */
/*function fn_insertReservation(){
	var comSubmit = new ComSubmit("frm");
	
	if(!$('#courtName > option:selected').val()) {
	    alert("코트를 선택해주세요.");
	} else if (!$('#openTime > option:selected').val()) {
	    alert("시작 시간을 선택해주세요.");
	} else if (!$('#closeTime > option:selected').val()) {
	    alert("종료 시간을 선택해주세요.");
	} else if(!$("#inputPrice").val()) {
		alert("가격을 입력해주세요.");
		$("inputPrice").focus();
		return false;
	} 
	
	if(confirm("등록 하시겠습니까?") == true) {
		comSubmit.setUrl("<c:url value='/' />"); 
		comSubmit.submit();
	} else {
		return;
	}
}

/!* cancle check *!/
function fn_openReservation() {
	var comSubmit = new ComSubmit();
	
	if(confirm("정말 취소하시겠습니까?") == true) {
		comSubmit.setUrl("<c:url value='/reservation.jsp' />");
		comSubmit.submit();
	} else {
		return;
	}
}*/

function gfn_isNull(str) {
	if (str == null) return true;
	if (str == "NaN") return true;
	if (new String(str).valueOf() == "undefined") return true;
	var chkStr = new String(str);
	if( chkStr.valueOf() == "undefined" ) return true;
	if (chkStr == null) return true;
	if (chkStr.toString().length == 0 ) return true;
	return false;
}

function ComSubmit(opt_formId) {
	this.formId = gfn_isNull(opt_formId) == true ? "commonForm" : opt_formId;
	this.url = "";

	if(this.formId == "commonForm"){
		$("#commonForm")[0].reset();
	}

	this.setUrl = function setUrl(url){
		this.url = url;
	};

	this.addParam = function addParam(key, value){
		$("#"+this.formId).append($("<input type='hidden' name='"+key+"' id='"+key+"' value='"+value+"' >"));
	};

	this.submit = function submit(){
		var frm = $("#"+this.formId)[0];
		frm.action = this.url;
		frm.method = "post";
		frm.submit();
	};
}
