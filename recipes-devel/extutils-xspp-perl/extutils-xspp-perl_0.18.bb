DESCRIPTION = "Anything that does not look like a XS++ directive or a class declaration is \
passed verbatim to XS. If you want XS++ to ignore code that looks like a \
XS++ directive or class declaration, simply surround it with a raw block \
delimiter like this:"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/ExtUtils-XSpp"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SM/SMUELLER/ExtUtils-XSpp-0.18.tar.gz"

SRC_URI[md5sum] = "c44ad3281df81319d02833a4e42282ac"
SRC_URI[sha256sum] = "9176ad646729e3bd27cf7abf114bedd3424bff1ba61185cfc7d54f3a9223a8ff"
DEPENDS += "module-build-perl-native"
DEPENDS += "test-base-perl-native"
DEPENDS += "test-differences-perl-native"

S = "${WORKDIR}/ExtUtils-XSpp-${PV}"

inherit cpan_build allarch

BBCLASSEXTEND = "native"
