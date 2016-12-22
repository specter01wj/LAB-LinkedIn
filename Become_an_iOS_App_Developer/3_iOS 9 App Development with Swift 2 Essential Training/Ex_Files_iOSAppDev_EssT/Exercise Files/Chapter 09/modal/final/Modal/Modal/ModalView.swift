//
//  ModalView.swift
//  Modal
//
//  Created by LDC on 2/23/16.
//  Copyright © 2016 LDC. All rights reserved.
//

import UIKit

class ModalView: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()

        // Do any additional setup after loading the view.
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
    

    @IBAction func didTapDone(sender: AnyObject) {
        self.dismissViewControllerAnimated(true) { () -> Void in
            print("complete!")
        }
    }
    /*
    // MARK: - Navigation

    // In a storyboard-based application, you will often want to do a little preparation before navigation
    override func prepareForSegue(segue: UIStoryboardSegue, sender: AnyObject?) {
        // Get the new view controller using segue.destinationViewController.
        // Pass the selected object to the new view controller.
    }
    */

}
