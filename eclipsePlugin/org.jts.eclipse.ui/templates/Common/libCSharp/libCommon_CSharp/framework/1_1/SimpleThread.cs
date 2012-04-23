/***********           LICENSE HEADER   *******************************
JAUS Tool Set
Copyright (c)  2010, United States Government
All rights reserved.

Redistribution and use in source and binary forms, with or without 
modification, are permitted provided that the following conditions are met:

       Redistributions of source code must retain the above copyright notice, 
this list of conditions and the following disclaimer.

       Redistributions in binary form must reproduce the above copyright 
notice, this list of conditions and the following disclaimer in the 
documentation and/or other materials provided with the distribution.

       Neither the name of the United States Government nor the names of 
its contributors may be used to endorse or promote products derived from 
this software without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" 
AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE 
IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE 
ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE 
LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR 
CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF 
SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS 
INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN 
CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
POSSIBILITY OF SUCH DAMAGE.
*********************  END OF LICENSE ***********************************/
using System;
using System.Threading;
/**
 * <summary>The parent class for all generated services and the JausRouter.</summary>
 * <author>Gina Nearing</author>
 * <date>4/1/11</date>
 */

namespace JTS
{
	public class SimpleThread
	{
		protected Thread thread;
        protected const int THREAD_JOIN_TIME = 100;

		public SimpleThread ()
		{
		}

        /// <summary>
        /// Calls the run() method in the child class
        /// to start the thread.
        /// </summary>
		public void start()
		{
            thread = new Thread(run);
			thread.Start();
		}

        /// <summary>
        /// Overridden by the child class.
        /// </summary>
        public virtual void run()
		{
            Console.WriteLine("Using default run.");
		}

        /// <summary>
        /// Overridden by the child class.
        /// Preform and clean up and join the thread.
        /// </summary>
        public virtual void stop()
		{
            Console.WriteLine("Using default stop.");
            thread.Join(THREAD_JOIN_TIME);
		}
			
	}
}
