DESCRIPTION = "This is the "Class::Singleton" module. A Singleton describes an object \
class that can have only one instance in any system. An example of a \
Singleton might be a print spooler or system registry. This module \
implements a Singleton class from which other classes can be derived. By \
itself, the "Class::Singleton" module does very little other than manage \
the instantiation of a single object. In deriving a class from \
"Class::Singleton", your module will inherit the Singleton instantiation \
method and can implement whatever specific functionality is required."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Class-Singleton"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SH/SHAY/Class-Singleton-1.6.tar.gz"

SRC_URI[md5sum] = "d9c84a7b8d1c490c38e88ed1f9faae47"
SRC_URI[sha256sum] = "27ba13f0d9512929166bbd8c9ef95d90d630fc80f0c9a1b7458891055e9282a4"

S = "${WORKDIR}/Class-Singleton-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
