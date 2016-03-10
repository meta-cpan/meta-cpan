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

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Struct-Dumb-0.09.tar.gz"

SRC_URI[md5sum] = "bb9ea100dc6f9ecd1c345381930dda08"
SRC_URI[sha256sum] = "337d917920e66afc752675397487a03dac813f773e3c30e006a0ce8e55fc393d"
DEPENDS += "module-build-perl-native"
DEPENDS += "test-fatal-perl-native"

S = "${WORKDIR}/Struct-Dumb-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
