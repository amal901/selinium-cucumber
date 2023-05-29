package com.e2eTest.automation.page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;

import com.e2eTest.automation.utils.Setup;

public class VendorPage {

	public By vendor = By.xpath("//*[contains(text(),'Vendors')]");
	private By addVendor = By.linkText("Add new");
	private By nameVendor = By.id("Name");
	private By frame = By.id("Description_ifr");
	private By messageVendor = By.id("tinymce");
	private By emailVendor = By.id("Email");
	private By saveVendor = By.name("save");
	private By messageAlertVendor = By.xpath("//div[@class='alert alert-danger alert-dismissable']");

	public WebElement getVendor() {
		return Setup.getDriver().findElement(vendor);
	}

	public WebElement getAddVendor() {
		return Setup.getDriver().findElement(addVendor);
	}

	public WebElement getNameVendor() {
		return Setup.getDriver().findElement(nameVendor);
	}
	
	public WebElement getFrame() {
		return Setup.getDriver().findElement(frame);
	}

	public WebElement getMessageVendor() {
		return Setup.getDriver().findElement(messageVendor);
	}

	public WebElement getEmailVendor() {
		return Setup.getDriver().findElement(emailVendor);
	}

	public WebElement getSaveVendor() {
		return Setup.getDriver().findElement(saveVendor);
	}
	
	public WebElement getMessageAlertVendor() {
		return Setup.getDriver().findElement(messageAlertVendor);
	}

	public WebElement getVendorWrappedElement() {
		WebElement vendorElement = getVendor();
		WrapsElement wrappedVendor = new WrapsElement() {
			public WebElement getWrappedElement() {
				return vendorElement;
			}
		};
		return wrappedVendor.getWrappedElement();
	}
	
	public WebElement getAddVendorWrappedElement() {
		WebElement addVendorElement = getAddVendor();
		WrapsElement wrappedAddVendor = new WrapsElement() {
			public WebElement getWrappedElement() {
				return addVendorElement;
			}
		};
		return wrappedAddVendor.getWrappedElement();
	}
	
	public WebElement getNameVendorWrappedElement() {
		WebElement nameVendorElement = getNameVendor();
		WrapsElement wrappedNameVendor = new WrapsElement() {
			public WebElement getWrappedElement() {
				return nameVendorElement;
			}
		};
		return wrappedNameVendor.getWrappedElement();
	}
	
	public WebElement getFrameWrappedElement() {
		WebElement frameElement = getFrame();
		WrapsElement wrappedFrame = new WrapsElement() {
			public WebElement getWrappedElement() {
				return frameElement;
			}
		};
		return wrappedFrame.getWrappedElement();
	}

	public WebElement getMessageVendorWrappedElement() {
		WebElement messageVendorElement = getMessageVendor();
		WrapsElement wrappedMessageVendor = new WrapsElement() {
			public WebElement getWrappedElement() {
				return messageVendorElement;
			}
		};
		return wrappedMessageVendor.getWrappedElement();
	}
	
	public WebElement getEmailVendorWrappedElement() {
		WebElement emailVendorElement = getEmailVendor();
		WrapsElement wrappedEmailVendor = new WrapsElement() {
			public WebElement getWrappedElement() {
				return emailVendorElement;
			}
		};
		return wrappedEmailVendor.getWrappedElement();
	}
	
	public WebElement getSaveVendorWrappedElement() {
		WebElement saveVendorElement = getSaveVendor();
		WrapsElement wrappedSaveVendor = new WrapsElement() {
			public WebElement getWrappedElement() {
				return saveVendorElement;
			}
		};
		return wrappedSaveVendor.getWrappedElement();
	}
	
	public WebElement getMessageAlertVendorWrappedElement() {
		WebElement messageAlertVendorElement = getMessageAlertVendor();
		WrapsElement wrappedMessageAlert = new WrapsElement() {
			public WebElement getWrappedElement() {
				return messageAlertVendorElement;
			}
		};
		return wrappedMessageAlert.getWrappedElement();
	}
}
