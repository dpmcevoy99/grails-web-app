package grails.web.app

class UserController {

    def index() {
		
		User user1 = new User()
		user1.name = "Alan Smith"
		user1.address = "1 Main Street"
		
		user1.save()
		
		render "Hello World!"
	}
	

}
