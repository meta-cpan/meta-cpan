DESCRIPTION = "Testing code can involve making sure that files are created and deleted as \
expected. Doing this manually can be error prone, as it's easy to forget a \
file, or miss that some unexpected file was added. This module simplifies \
maintaining test directories by tracking their status as they are modified \
or tested with this API, making it simple to test both individual files, as \
well as to verify that there are no missing or unknown files."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Directory"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SA/SANBEG/Test-Directory-0.051.tar.gz"

SRC_URI[md5sum] = "7ee3e9f7ac78e6d18127855dd1b83ccd"
SRC_URI[sha256sum] = "0361bc33c38da0f9be5901480660afb161936d6d7481fb7e86fa14d9b69bfb2c"
DEPENDS += "test-exception-perl-native"

S = "${WORKDIR}/Test-Directory-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
