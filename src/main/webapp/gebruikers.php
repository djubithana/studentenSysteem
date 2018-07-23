<?php  include'inc/head.php';?>
<div class="container-fluid">
	<div class="row">
		<?php  include'inc/sidebar.php';?>
		<div class="main col-md-10">
		<section class="jumbotron text-center header-jumbo">
			<div class="container">
				<h4 class="jumbotron-heading">Gebruikers</h4>
				<button class="btn_dark_bg">Toevoegen</button>
			</div>
		</section>
		<div class="content">
			<div class="row">
			<!-- content komt hier -->

            <template>
              <form>
                <md-card>
                  <md-card-header :data-background-color="dataBackgroundColor">
                    <h4 class="title">Edit Profile</h4>
                    <p class="category">Complete your profile</p>
                  </md-card-header>

                  <md-card-content>
                    <div class="md-layout">
                      <div class="md-layout-item md-small-size-100 md-size-33">
                        <md-field>
                          <label>Company (disabled)</label>
                          <md-input v-model="disabled" disabled></md-input>
                        </md-field>
                      </div>
                      <div class="md-layout-item md-small-size-100 md-size-33">
                        <md-field>
                          <label>User Name</label>
                          <md-input v-model="username" type="text"></md-input>
                        </md-field>
                      </div>
                      <div class="md-layout-item md-small-size-100 md-size-33">
                        <md-field>
                          <label>Email Address</label>
                          <md-input v-model="emailadress" type="email"></md-input>
                        </md-field>
                      </div>
                      <div class="md-layout-item md-small-size-100 md-size-50">
                        <md-field>
                          <label>First Name</label>
                          <md-input v-model="firstname" type="text"></md-input>
                        </md-field>
                      </div>
                      <div class="md-layout-item md-small-size-100 md-size-50">
                        <md-field>
                          <label>Last Name</label>
                          <md-input v-model="lastname" type="text"></md-input>
                        </md-field>
                      </div>
                      <div class="md-layout-item md-small-size-100 md-size-100">
                        <md-field>
                          <label>Adress</label>
                          <md-input v-model="address" type="text"></md-input>
                        </md-field>
                      </div>
                      <div class="md-layout-item md-small-size-100 md-size-33">
                        <md-field>
                          <label>City</label>
                          <md-input v-model="city" type="text"></md-input>
                        </md-field>
                      </div>
                      <div class="md-layout-item md-small-size-100 md-size-33">
                        <md-field>
                          <label>Country</label>
                          <md-input v-model="country" type="text"></md-input>
                        </md-field>
                      </div>
                      <div class="md-layout-item md-small-size-100 md-size-33">
                        <md-field>
                          <label>Postal Code</label>
                          <md-input v-model="code" type="number"></md-input>
                        </md-field>
                      </div>
                      <div class="md-layout-item md-size-100">
                        <md-field maxlength="5">
                          <label>About Me</label>
                          <md-textarea v-model="aboutme"></md-textarea>
                        </md-field>
                      </div>
                      <div class="md-layout-item md-size-100 text-right">
                        <md-button class="md-raised md-success">Update Profile</md-button>
                      </div>
                    </div>

                  </md-card-content>
                </md-card>
              </form>
            </template>
            <script>
            export default {
              name: 'edit-profile-form',
              props: {
                dataBackgroundColor: {
                  type: String,
                  default: ''
                }
              },
              data () {
                return {
                  username: null,
                  disabled: null,
                  emailadress: null,
                  lastname: null,
                  firstname: null,
                  address: null,
                  city: null,
                  country: null,
                  code: null,
                  aboutme: "Lamborghini Mercy, Your chick she so thirsty, I'm in that two seat Lambo."
                }
              }
            }

            </script>
            <style>

            </style>








			<!-- content komt hier -->
		<table class="table table-condensed">
		  <thead>
			<tr>
			  <th scope="col">Voornaam</th>
			  <th scope="col">Achternaam</th>
			  <th scope="col">Email</th>
			  <th scope="col">Rol</th>
			  <th scope="col"></th>
			</tr>
		  </thead>
		  <tbody>
			<tr>
			  <td>Jane</td>
			  <td>Doe</td>
			  <td>naam@domein.com</td>
			  <td>Docent</td>
			  <td><button class="btn_tabel"><i class="fas fa-edit fa-1x"></i></button><button class="btn_tabel"><i class="fas fa-trash-alt fa-1x"></i></button></td>
			</tr>
		  </tbody>
		</table>
			</div>
		</div>
		</div>
	</div>
</div>

<?php  include'inc/bottom.php';?>