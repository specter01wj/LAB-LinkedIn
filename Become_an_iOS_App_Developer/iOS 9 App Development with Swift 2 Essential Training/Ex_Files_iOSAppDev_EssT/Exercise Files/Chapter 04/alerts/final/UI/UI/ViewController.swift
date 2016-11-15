//
//  ViewController.swift
//  UI
//
//  Created by LDC on 2/10/16.
//  Copyright © 2016 LDC. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    @IBAction func buttonWasTapped(sender: AnyObject) {
        let alert:UIAlertController = UIAlertController(title: "Button Tapped!", message: "A button was tapped on the screen.", preferredStyle: UIAlertControllerStyle.Alert)
        let action:UIAlertAction = UIAlertAction(title: "Close", style: UIAlertActionStyle.Default) { (a:UIAlertAction) -> Void in
            print("item selected!")
        }
        let action1:UIAlertAction = UIAlertAction(title: "Item 1", style: UIAlertActionStyle.Default) { (a:UIAlertAction) -> Void in
            print("item 1 selected!")
        }
        alert.addAction(action)
        alert.addAction(action1)
        self.presentViewController(alert, animated: true) { () -> Void in
            print("alert presented")
        }
    }
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

