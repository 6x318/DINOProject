<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
// 로그인 정보 header에서 처리
// 238줄 view_store.notice 은 store.jsp로 처리
// 가져갈것들 로그인정보 점포data
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>

	body{
		margin:0;
		padding:0;
        font-size:8px;
	}
    main{
        align-items: center;
    }
    h3{
        margin:0;
        font-size:12px;
        display:inline-block; 
    }
	.headerC{
        width: 1200px;
        height:100px;
		position: fixed;
        background-color: red;
        z-index: 3; 
	}
    .headerC .container{
        width: 100%;
        text-align: center;
        background-color: powderblue;
        
	}
	.pickupIntroImg {
        width: 1200px;
        height:100px;
        position: relative ;
		top:100px;
        padding-top: 10px;
		padding-left: 10px;
	}
    .pickupIntro {
        width: 1200px;
        height:100px;
		top:100px;
        position: relative; 
		padding-left: 10px;
		padding-bottom: 10px;
	}
   .middle{
        width: 1200px;
        height:600px;
		top:100px;
        position: relative;   
   }

   .title{
       vertical-align: auto;
   }
   .verticalImg{
       width: 5px;
       height: 20px;
       vertical-align: auto;
   }
   .middle .pickUpProgress {
       width:600px;
       float:left;
   }
   .middle .pickUpProgress .container{
       margin-left: 10px;
   }
   .middle .pickUpProgress .container .cardMid{
       margin-left: 10px;
   }
   .middle .pickUpQna {
       width:600px;
       position: relative; 
       display:inline-block; 
   }
   .middle .pickUpQna .container{
       margin-left: 10px;
   }
   .middle .pickUpQna .container .cardMid{
       margin-left: 10px;
   }
   .footerC{
        width: 1200px;
        height:100px;
        background-color: red;
   }
   .middle .title{
        color:red;
   }
   .bigText{
       font-size: 15px;
       color:red;
       margin-left:3px;
   }
   .stepBox{
        margin-bottom: 5px;
   }
   .qImg{
       font-size: 13px;
       color: #f00;
   }
   .aImg{
       font-size: 13px;
       color: #f00;
   }
   .qna{
        margin-bottom: 10px;
   }
   .borderBox{
		margin-left: 10px;
   }
   .cardBtm{
		padding-left: 10px;
		width: 150px;
		border: 1px solid grey;
		margin-left: 10px;
   }
    a:link { color:#f00; text-decoration:none; }
    a:visited { color:#f00; text-decoration:none; }
    a:hover { color:#f00; text-decoration:underline; }
</style>
</head>
<body>
<header><!-- nav(대분류, 로그인 ) -->
	<div class="headerC"><div class="container">상단바(대분류, 로그인 가져오기)</div></div>
</header>
<main><!-- img 폴더 저장위치는 어디에?? -->
	<div class="pickupIntroImg"><!-- img -->
		<div class="overlay">
			<div class="container">
				<img class="pickupImg" src="../asset/img/pickupintroimg.png">
			</div>
		</div>
	</div>
	<div class="pickupIntro"><!-- intro -->
		<div class="overlay">
			<div class="container">
				<div class="cardTop">
					<span class="title"><h3><img class="verticalImg" src="../asset/img/bar.png">매장픽업이란?</h3></span>
				</div>
				<div class="cardMid">
					<div class="borderBox">
						<p class="text">
							온라인 스토어에서 상품을 주문·결제하고, 고객님께서 지정하신 매장에서 상품을 픽업하는 서비스입니다.<br />
							원하는 배송지에 수령이 어렵거나 매장에서 즉시 착용을 원하시면 이용해보세요.<br/>
							※ 매장픽업 서비스는 일부 매장 한정 서비스입니다.
						</p>
					</div>
				</div>
				<div class="cardBtm">
					<a href="#">매장픽업 이용 가능 매장 보기</a>
				</div>
			</div>
		</div>
    </div>
<div class ="middle">
	<div class="pickUpProgress"><!-- 진행과정 -->
		<div class="overlay">
			<div class="container">
				<div class="cardTop">
					<span><img class="verticalImg" src="../asset/img/bar.png"><h3>진행과정</h3></span>
				</div>
				<div class="cardMid">
					<div class="stepBox">
						<div class="title">
							<span>STEP</span><span class="bigText">1</span>
						</div>
						<div class="text">
							구매를 희망하는상품, 색상, 사이즈 및 수량을 선택한 후 <span>'바로 구매하기'</span><br/>
							또는 <span>'장바구니에 담기'</span>를 클릭해주세요.
						</div>
					</div>
					<div class="stepBox">
						<div class="title">
							<span>STEP</span><span class="bigText">2</span>
						</div>
						<div class="text">
							주문서작성/결제 화면의<br />
							'3. 주문고객/배송지 정보 >배송방법 ><span>매장 픽업으로 찾기</span>'를<br/>
							선택합니다						
						</div>
					</div>
					<div class="stepBox">
						<div class="title">
							<span>STEP</span><span class="bigText">3</span>
						</div>
						<div class="text">
							매장명 또는 지역을 검색해<br />
							상품을 수령할<br/>
							점포를 선택합니다.
						</div>
					</div>
					<div class="stepBox">
						<div class="title">
							<span>STEP</span><span class="bigText">4</span>
						</div>
						<div class="text">
							수신인 및 휴대폰 번호를<br />
							입력하고, 주문 확인 및<br/>
							결제까지 완료해주십시오.
						</div>
					</div>
				</div>
			</div>
		</div>
    </div>
	<div class="pickUpQna"><!-- qna -->
		<div class="overlay">
			<div class="container">
				<div class="cardTop">
					<span><img class="verticalImg" src="../asset/img/bar.png"><h3>유의사항</h3></span>
				</div>
				<div class="cardMid">
					<div class="qna">
						<div class="q">
							<span class="qImg" >Q</span>:
							<span>매장픽업 서비스는 무엇인가요?</span>
						</div>
						<div class="a">
							<span class="aImg" >A</span>:
							<span>온라인 스토어를 통해 재고가 있는 가까운 매장에서 당일 픽업할 수 있는 서비스입니다.</span>
						</div>
					</div>
					<div class="qna">
						<div class="q">
							<span class="qImg" >Q</span>:
							<span>주문이 가능한 매장은 어디인가요?</span>
						</div>
						<div class="a"><!-- store.jsp 매장보기 jsp로 이동 -->
							<span class="aImg" >A</span>:
							<span><a href="view_store.notice">매장픽업 이용 가능 매장 보기 ></a></span>
						</div>
					</div>
					<div class="qna">
						<div class="q">
							<span class="qImg" >Q</span>:
							<span>매장픽업 서비스 이용이 가능한 매장이지만 조회가 되지 않는 이유는 무엇인가요?</span>
						</div>
						<div class="a">
							<span class="aImg" >A</span>:
							<span>주문하신 전체 상품이 있는 점포만 노출되며, 온라인 특별상품 & 특별 사이즈는 주문이 불가능합니다.</span>
						</div>
					</div>
					<div class="qna">
						<div class="q">
							<span class="qImg" >Q</span>:
							<span>매장픽업 교환·반품은 어떻게 하나요?</span>
						</div>
						<div class="a">
							<span class="aImg" >A</span>:
							<span>반품은 온라인 스토어 접수 후 매장으로 방문(상품 TAG 제거 안 한 상태, 영수증 지참) 부탁드립니다.<br/>
								&nbsp;&nbsp;&nbsp;&nbsp;동일 가격의 교환은 접수 없이 전 매장에서 가능합니다.<br/>
								&nbsp;&nbsp;&nbsp;&nbsp;※상품 수령 전 반품 접수는 불가능합니다
							</span>
						</div>
					</div>
					<div class="qna">
						<div class="q">
							<span class="qImg" >Q</span>:
							<span>결제 완료 후 상품의 부분 교환·취소가 가능한가요?</span>
						</div>
						<div class="a">
							<span class="aImg" >A</span>:
							<span>불가능합니다. 주문 취소 후 재주문 부탁 드립니다.</span>
						</div>
					</div>
					<div class="qna">
						<div class="q">
							<span class="qImg" >Q</span>:
							<span>온라인과 오프라인 매장의 가격은 동일하나요?</span>
						</div>
						<div class="a">
							<span class="aImg" >A</span>:
							<span>
								온라인 스토어와 오프라인 매장의 판매가격은 동일하게 적용됩니다.<br /> 
								&nbsp;&nbsp;&nbsp;&nbsp;다만 변동된 가격의 적용 시점 차이가 발생할 수 있습니다.<br />
								&nbsp;&nbsp;&nbsp;&nbsp;매장픽업을 주문하신 경우 온라인 스토어 가격을 기준으로 적용됩니다.
                            </span>
						</div>
					</div>
					<div class="qna">
						<div class="q">
							<span class="qImg" >Q</span>:
							<span>주문 당일 픽업이 가능한가요?</span>
						</div>
						<div class="a">
							<span class="aImg" >A</span>:
							<span class="text">
								당일 오후 6시까지 주문하신 경우 당일 픽업이 가능합니다.매장에서 상품준비가 완료되면 교환권을 발송해 드리며,<br />
								&nbsp;&nbsp;&nbsp;&nbsp;교환권를 수신하신 이후 방문 수령 하시면 됩니다.<br />
								&nbsp;&nbsp;&nbsp;&nbsp;※매장별 영업시간은 상이하오니 확인 후 방문을 부탁드립니다.
                            </span>
						</div>
					</div>
					<div class="qna">
						<div class="q">
							<span class="qImg" >Q</span>:
							<span>주문 후 픽업은 언제까지 가능한가요?</span>
						</div>
						<div class="a">
							<span class="aImg" >A</span>:
							<span>픽업 예정일 포함 +3일까지 보관 가능하며, 매장 영업시간은 상이하오니 확인 후 방문 부탁드립니다.</span>
						</div>
					</div>
				</div>
			</div>
		</div>
    </div>
</main>
<footer><!-- nav(footer관련) -->
	<div class="footerC"><div class="container">풋터(가져오기)</div></div>
</footer>
</body>
</html>