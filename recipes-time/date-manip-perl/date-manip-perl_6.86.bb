DESCRIPTION = "Date::Manip is a series of modules designed to make any common date/time \
operation easy to do. Operations such as comparing two times, determining a \
date a given amount of time from another, or parsing international times \
are all easily done. It deals with time as it is used in the Gregorian \
calendar (the one currently in use) with full support for time changes due \
to daylight saving time."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Date-Manip"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SB/SBECK/Date-Manip-6.86.tar.gz"

SRC_URI[md5sum] = "77123a4cc874f72d7188f859626bdd84"
SRC_URI[sha256sum] = "b5203782d03c79aa5822cf33d1828aaa3b4db93a275d4a428c89f56f4713361f"
DEPENDS += "test-inter-perl-native"

S = "${WORKDIR}/Date-Manip-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
