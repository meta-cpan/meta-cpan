DESCRIPTION = "This module provides a convenient way to perform cleanup or other forms of \
resource management at the end of a scope. It is particularly useful when \
dealing with exceptions: the "Scope::Guard" constructor takes a reference \
to a subroutine that is guaranteed to be called even if the thread of \
execution is aborted prematurely. This effectively allows lexically-scoped \
"promises" to be made that are automatically honoured by perl's garbage \
collector."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Scope-Guard"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/C/CH/CHOCOLATE/Scope-Guard-0.21.tar.gz"

SRC_URI[md5sum] = "be57b915d23ddac7677ef2ad9e52b92a"
SRC_URI[sha256sum] = "8c9b1bea5c56448e2c3fadc65d05be9e4690a3823a80f39d2f10fdd8f777d278"

S = "${WORKDIR}/Scope-Guard-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
