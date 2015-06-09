DESCRIPTION = "This collection of modules allows programs to be written that perform \
asynchronous filehandle IO operations. A typical program using them would \
consist of a single subclass of IO::Async::Loop to act as a container of \
other objects, which perform the actual IO work required by the program. \
As well as IO handles, the loop also supports timers and signal handlers, \
and includes more higher-level functionality built on top of these basic \
parts."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/IO-Async"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/IO-Async-0.67.tar.gz"

SRC_URI[md5sum] = "ce6f002ba0bc0e1ec3a58100d0e28823"
SRC_URI[sha256sum] = "4e4325d29db4d4aa25a3e1727597547007cb829a7d5f433d66d9f146bc90a46e"
RDEPENDS_${PN} += "future-perl"
RDEPENDS_${PN} += "socket-perl"
RDEPENDS_${PN} += "struct-dumb-perl"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-identity-perl-native"
DEPENDS += "test-refcount-perl-native"

S = "${WORKDIR}/IO-Async-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
