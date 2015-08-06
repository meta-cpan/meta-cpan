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

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/IO-Async-0.68.tar.gz"

SRC_URI[md5sum] = "4d5177c823d17cecb6c4f9588ac80d9d"
SRC_URI[sha256sum] = "8879a934e59ced892354820583b4d1d5c8a9786ca2180951a8cf98e15936e7d6"
RDEPENDS_${PN} += "future-perl"
RDEPENDS_${PN} += "socket-perl"
RDEPENDS_${PN} += "struct-dumb-perl"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-identity-perl-native"
DEPENDS += "test-refcount-perl-native"

S = "${WORKDIR}/IO-Async-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
