DESCRIPTION = "The "Devel::StackTrace" module contains two classes, "Devel::StackTrace" \
and Devel::StackTrace::Frame. These objects encapsulate the information \
that can retrieved via Perl's "caller" function, as well as providing a \
simple interface to this data."

SECTION = "libs"
LICENSE = "Artistic-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Devel-StackTrace"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-2.0;md5=8bbc66f0ba93cec26ef526117e280266"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Devel-StackTrace-2.03.tar.gz"

SRC_URI[md5sum] = "1eb6874d834f3d5d15fa626dd726df77"
SRC_URI[sha256sum] = "7618cd4ebe24e254c17085f4b418784ab503cb4cb3baf8f48a7be894e59ba848"

S = "${WORKDIR}/Devel-StackTrace-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
