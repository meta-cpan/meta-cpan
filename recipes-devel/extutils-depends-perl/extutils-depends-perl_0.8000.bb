DESCRIPTION = "This module tries to make it easy to build Perl extensions that use \
functions and typemaps provided by other perl extensions. This means that a \
perl extension is treated like a shared library that provides also a C and \
an XS interface besides the perl one."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/ExtUtils-Depends"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/X/XA/XAOC/ExtUtils-Depends-0.8000.tar.gz"

SRC_URI[md5sum] = "ac2d17114f1b50624a8f37381c90485e"
SRC_URI[sha256sum] = "780ff72128c04c2a22e6801187aa9c58cab298407f6e9d062706af1c250bbe98"
RECOMMENDS += "test-number-delta-perl-native"

S = "${WORKDIR}/ExtUtils-Depends-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
