DESCRIPTION = "The "Devel::StackTrace" module contains two classes, Devel::StackTrace \
and Devel::StackTrace::Frame. These objects encapsulate the information \
that can retrieved via Perl's "caller()" function, as well as providing a \
simple interface to this data."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Devel-StackTrace"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Devel-StackTrace-2.01.tar.gz"

SRC_URI[md5sum] = "164a5908bcfb79a8fbbca1a2182416ae"
SRC_URI[sha256sum] = "055d35b5dbe62b88af7a15b347f7759cacb376dda345e0bd092a549384c30c13"

S = "${WORKDIR}/Devel-StackTrace-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
