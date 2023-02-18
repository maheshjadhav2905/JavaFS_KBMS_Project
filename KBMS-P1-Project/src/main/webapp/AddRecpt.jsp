<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> Receptionist</title>


          <!-- Google Fonts -->
          <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Playfair+Display:ital,wght@0,400;0,500;0,600;0,700;1,400;1,500;1,600;1,700|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">
    
          <!-- Vendor CSS Files -->
          <link href="assets/vendor/animate.css/animate.min.css" rel="stylesheet">
          <link href="assets/vendor/aos/aos.css" rel="stylesheet">
          <link href="assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
          <link href="assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
          <link href="assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
          <link href="assets/vendor/glightbox/css/glightbox.min.css" rel="stylesheet">
          <link href="assets/vendor/swiper/swiper-bundle.min.css" rel="stylesheet">
        
          <!-- Template Main CSS File -->
          <link href="assets/css/style.css" rel="stylesheet">
    
</head>
<body style="background-image: url('https://cdn.pixabay.com/photo/2016/11/18/14/05/brick-wall-1834784_960_720.jpg'); background-repeat: no-repeat; background-size: cover;">

  <!-- ======= Top Bar ======= -->
  <div id="topbar" class="d-flex align-items-center fixed-top">
    <div class="container d-flex justify-content-center justify-content-md-between">
      
    </div>
  </div>

  <!-- ======= Header ======= -->
  <header id="header" class="fixed-top d-flex align-items-cente">
    <div class="container-fluid container-xl d-flex align-items-center justify-content-lg-between">
      <h1 class="logo me-auto me-lg-0"><a href="index.html">Register yourself</a></h1>    
      <nav id="navbar" class="navbar order-last order-lg-0">
         <i class="bi bi-list mobile-nav-toggle"></i>
      </nav>
    </div>
  </header><!-- End Header -->
  
    <section id="adminPage" class="d-flex align-items-center">
        <div class="adminPage">
          <!-- <img src="img_snow.jpg" alt="Snow"> -->
          <div class="adminWork" style="margin-top: 30%;" id="adm">
          <form action="AddReceptionist" method="post">
          
                             <div>
                               <label for="Name" class="float-left">Full Name</label>
                               <input type="text" name = "name" class="form-control w-50" placeholder="Enter your name"><br>
                             </div>
                             
                                              <div>
                               <label for="Email" class="float-left">Email</label>
                               <input type="email" name = "email" class="form-control w-50" placeholder="Enter your email"><br>
                             </div>
                              <div>
                                <label for="Number" class="float-left">Contact Number</label>
                                <input type="tel" name = "phone" class="form-control w-50" placeholder="Enter Contact No."><br>
                              </div>
                               <div>
                                 <label for="address" class="float-left">Address</label>
                                 <input type="text" name = "address" class="form-control w-50" placeholder="Enter here your address"><br>
                               </div>
                                 <div>
                                 <label for="dob" class="float-left">DOB</label>
                                 <input type="text" name = "dob" class="form-control w-50" placeholder="Enter here your date of birth"><br>
                               </div>
                            
                             
                            <!--  <div>
                              <label class="float-left">Designation</label>
                              <select class="form-control w-50" name = "designation">
                                <option value = "Visitor Focused Receptionist">Visitor Focused Receptionist</option>
                                <option value = "Office Manager Receptionist">Office Manager Receptionist</option>
                                <option value = "HR Focused Receptionist">HR Focused Receptionist</option>
                                <option value ="Executive Assistant Receptionist">Executive Assistant Receptionist</option>
                                <option value="Customer Service Based Receptionist">Customer Service Based Receptionist</option>
                                <option value = "Social Media Marketing Receptionist">Social Media Marketing Receptionist</option>
                                
                              </select><br>
                            
                             </div> -->

                               <div>                          
                                 <label for="Age" class="float-left">Age</label>
                                 <input type="number" name = "age" class="form-control w-50" placeholder="Enter your Age"><br>
                               </div>

                              
                               <div>
                                 <label for="float-left" class="float-left">Password</label>
                                 <input type="password" name = "password" class="form-control w-50" placeholder="Enter Password"><br>
                               </div>  
                                <div>
                                 <label for="float-left" class="float-left">IdentityProof</label>
                                 <input type="text" name = "proof" class="form-control w-50" placeholder="Enter Identity"><br>
                               </div>  
                                <div>
                                 <label for="float-left" class="float-left">Login Id</label>
                                 <input type="text" name = "login" class="form-control w-50" placeholder="Enter Login Id"><br>
                               </div>                           
             
                              
       
                          <div>
                             <button type="submit" class="btnAdm">Submit </button>
                             <!-- <button type="submit" class="btnAdm">Cancel</button> -->
                          </div>
                        
                    </div>
                    </form>
                 

          </div>
        </div>
        <div class="row">
          <div class="col-lg-4 d-flex align-items-center justify-content-center position-relative" data-aos="zoom-in" data-aos-delay="200">
           
          </div>
        </div>  
       
      </section><!-- End Hero -->

      
    
    
</body>
</html>