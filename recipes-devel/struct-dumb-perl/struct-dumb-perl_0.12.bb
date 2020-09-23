DESCRIPTION = ""Struct::Dumb" creates record-like structure types, similar to the "struct" \
keyword in C, C++ or C#, or "Record" in Pascal. An invocation of this \
module will create a construction function which returns new object \
references with the given field values. These references all respond to \
lvalue methods that access or modify the values stored."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Struct-Dumb"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Struct-Dumb-0.12.tar.gz"

SRC_URI[md5sum] = "b17df247f2e42c0b80a8b11b9fc3d824"
SRC_URI[sha256sum] = "52ce70c433e6962ad1c20e9e297a5391e0b74a44520fbce2e482f544e3657f73"
DEPENDS += "module-build-perl-native"
DEPENDS += "test-fatal-perl-native"

S = "${WORKDIR}/Struct-Dumb-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
