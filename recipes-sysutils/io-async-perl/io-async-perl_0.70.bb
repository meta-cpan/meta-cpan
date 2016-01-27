DESCRIPTION = "This collection of modules allows programs to be written that perform \
asynchronous filehandle IO operations. A typical program using them would \
consist of a single subclass of IO::Async::Loop to act as a container of \
other objects, which perform the actual IO work required by the program. As \
well as IO handles, the loop also supports timers and signal handlers, and \
includes more higher-level functionality built on top of these basic parts."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/IO-Async"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/IO-Async-0.70.tar.gz"

SRC_URI[md5sum] = "9b5316f6a36154d79921b79f2545109e"
SRC_URI[sha256sum] = "646c2d7573f80755216a97cd0eb513dd3b13523bd01ad4d883379898db265b4a"
RDEPENDS_${PN} += "future-perl"
RDEPENDS_${PN} += "struct-dumb-perl"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-identity-perl-native"
DEPENDS += "test-refcount-perl-native"

S = "${WORKDIR}/IO-Async-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
