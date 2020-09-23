DESCRIPTION = "The Perl garbage collector uses simple reference counting during the normal \
execution of a program. This means that cycles or unweakened references in \
other parts of code can keep an object around for longer than intended. To \
help avoid this problem, the reference count of a new object from its class \
constructor ought to be 1. This way, the caller can know the object will be \
properly DESTROYed when it drops all of its references to it."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Refcount"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Test-Refcount-0.10.tar.gz"

SRC_URI[md5sum] = "1c2cbb02b69efa824a0d17b76bf2fbc5"
SRC_URI[sha256sum] = "0457c20a4956473d157c4faaff8814154bc93f6e2b543c2812a19ff8e3370eb2"
RRECOMMENDS_${PN} += "devel-mat-perl"
DEPENDS += "module-build-perl-native"
RRECOMMENDS_${PN} += "devel-mat-perl"

S = "${WORKDIR}/Test-Refcount-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
