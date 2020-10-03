<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=8,IE=9,IE=10,IE=11,edge" />
		<link rel="stylesheet" type="text/css" href="fonts/iconfont.css"/>
		<link rel="stylesheet" type="text/css" href="css/footer.css"/>
		<link rel="stylesheet" href="css/dialog.css" />
		<link rel="stylesheet" href="css/login.css" />
		<title>登录</title>		
	</head>
	<body>
		<div class="login-box">		
			<div class="login-title">登录</div>
			<div class="login-form">
				<form action="login" id="form">
					<!--账户名-->
					<div class="form-item user">
						<div class="form-ctrl">
							<input type="text" id="userMail" name="uid" value="" placeholder="昵称/手机/邮箱" style="vertical-align:top">
						</div>
						<div class="form-tips">							
							<span class="error" id="user_error" style="display: none;">用户名不能为空</span>							
						</div>
					</div>
					<!--密码-->
					<div class="form-item pass">
                        <div class="form-ctrl">
                            <input type="password" id="userPassword" name="upassword" value="" placeholder="请输入密码">
                        </div>
                        <div class="form-tips">                        	
                        	<span class="error" id="pass_error" style="display: none;">密码不能为空</span>                        	
                        </div>
                    </div>
                     <div class="C_radio">
                     	<input type="radio" name="type"value="g" checked="checked"/><p>管理员</p>
                     	<input type="radio"name="type"value="k" /><p>快递员</p>
                     </div>
                    <!--记住密码
                    <div class="form-item box">
                        <div class="rememb">
                            <div class="checkbox-group">
                                <input type="checkbox" checked="checked" id="save_pass" class="isRemberPass">
                                <label for="save_pass" class="checkbox">记住密码</label>
                            </div>
                        </div>
                        <div class="box-fr">
                            <a href="#" class="btn btn-link">忘记密码?</a>
                        </div>
                        
                    </div>
                    -->
                    <!--登录按钮-->
                    <div class="form-item form-button">
                        <button type="submit" class="btn btn-green block btn-login" onclick="checkForm()">登录 </button>
                    </div>
                                                                            
				</form>
			</div>
		</div>
		
		
		<!--信息提示框-->
		<div class="dialog-content"></div>		
		
		<script src="js/jquery.min.js" type="text/javascript"></script>
		<script src="js/dialog.js" type="text/javascript"></script>
		<script type="text/javascript" type="text/javascript">	

			/* function checkForm(){
				var username = document.getElementById("userMail").value;
		        var password = document.getElementById("userPassword").value;
		        //是否记住登录密码  默认记住登录密码true
		        var isCheck = document.getElementsByClassName("isRemberPass")[0].checked;
		        var isRemberPass = '1';
		        if(isCheck){
		        	isRemberPass = '1';
		        }else{
		        	isRemberPass = '0';
		        } */
		     
		       
		 
		        var userError = document.getElementById("user_error");
		        var passError = document.getElementById("pass_error");
                               
                if (username == "" || username == null || username == undefined) {		             
		             userError.style.cssText='display:block;';
		             passError.style.cssText='display:none;';
		             return false;
		           
		        } else if (password == "" || password == null || password == undefined) {
		            passError.style.cssText='display:block;';
		            userError.style.cssText='display:none;';
		            return false;
		            
		        }else{
		        	passError.style.cssText='display:none;';
		            userError.style.cssText='display:none;';
		    		
		    		//ajax后台post登录请求 （假设登录成功）
		    		
		    		dialog($,'success','登陆成功！');
//					dialog($,'error','登陆失败！');
		    		
		    		
		        }



		
		</script>
		<br />
		<br />
		<br />
		<br />
		<br />
		<br />
		<br />
		
	</body>
</html>
