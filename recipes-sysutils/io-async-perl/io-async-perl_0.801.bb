DESCRIPTION = "This collection of modules allows programs to be written that perform \
asynchronous filehandle IO operations. A typical program using them would \
consist of a single subclass of IO::Async::Loop to act as a container of \
other objects, which perform the actual IO work required by the program. As \
well as IO handles, the loop also supports timers and signal handlers, and \
includes more higher-level functionality built on top of these basic parts."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/IO-Async"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/IO-Async-0.801.tar.gz"

SRC_URI[md5sum] = "f2b4e83922d2b96b70aaac9229d6690a"
SRC_URI[sha256sum] = "89e459ba17b76a572bb1b4bb120301541e8cc93242417166236b6c6db0e1c9b9"
RDEPENDS:${PN} += "future-perl"
RDEPENDS:${PN} += "struct-dumb-perl"
DEPENDS += "module-build-perl-native"
DEPENDS += "test-fatal-perl-native"
DEPENDS += "test-identity-perl-native"
DEPENDS += "test-metrics-any-perl-native"
DEPENDS += "test-refcount-perl-native"

S = "${WORKDIR}/IO-Async-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
